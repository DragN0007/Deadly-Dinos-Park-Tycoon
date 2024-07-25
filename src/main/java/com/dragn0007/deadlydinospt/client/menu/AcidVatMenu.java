package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import com.dragn0007.deadlydinospt.client.gui.DDPTMenuTypes;
import com.dragn0007.deadlydinospt.client.gui.slot.DDPTResultSlot;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AcidVatMenu extends AbstractContainerMenu {
    private final AcidVatEntity blockEntity;
    private final Level level;
    private final ContainerData data;
    private final Slot ingredientSlot;

    public AcidVatMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2), new SimpleContainer(4));
    }

    public AcidVatMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data, Container container) {
        super(DDPTMenuTypes.ACID_VAT_MENU.get(), pContainerId);
        checkContainerSize(inv, 4);
        blockEntity = ((AcidVatEntity) entity);
        this.level = inv.player.level;
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.ingredientSlot = this.addSlot(new AcidVatMenu.IngredientsSlot(container, 1, 79, 17));

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new AcidVatMenu.FuelSlot(container, 0, 33, 34));
            this.addSlot(new DDPTResultSlot(handler, 2, 56, 51));
            this.addSlot(new DDPTResultSlot(handler, 3, 102, 51));
        });
    }

    static class IngredientsSlot extends Slot {
        public IngredientsSlot(Container p_39115_, int p_39116_, int p_39117_, int p_39118_) {
            super(p_39115_, p_39116_, p_39117_, p_39118_);
        }
        public boolean mayPlace(ItemStack itemStack) {
            return itemStack.is(DDPTTags.Items.DINO_BONES);
        }
        public int getMaxStackSize() {
            return 64;
        }
    }

    static class FuelSlot extends Slot {
        public FuelSlot(Container p_39105_, int p_39106_, int p_39107_, int p_39108_) {
            super(p_39105_, p_39106_, p_39107_, p_39108_);
        }
        public boolean mayPlace(ItemStack p_39111_) {
            return mayPlaceItem(p_39111_);
        }
        public static boolean mayPlaceItem(ItemStack p_39113_) {
            return p_39113_.is(DDPTItems.ACID_BUCKET.get());
        }
        public int getMaxStackSize() {
            return 64;
        }
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressArrowSize = 26;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 4;

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, DDPTBlocksDataGen.ACID_VAT.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}