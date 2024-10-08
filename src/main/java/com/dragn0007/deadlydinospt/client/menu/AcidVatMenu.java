package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import com.dragn0007.deadlydinospt.client.gui.DDPTMenuTypes;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class AcidVatMenu extends AbstractContainerMenu {

    public final Container container;
    public final ContainerData data;

    public AcidVatMenu(int containerId, Inventory inventory, FriendlyByteBuf extraData) {
        this(containerId, inventory, new SimpleContainer(4), new SimpleContainerData(2));
    }

    public AcidVatMenu(int containerId, Inventory inventory, Container container, ContainerData data) {
        super(DDPTMenuTypes.ACID_VAT_MENU.get(), containerId);
        this.container = container;
        this.data = data;

        this.addSlot(new Slot(container, AcidVatEntity.FUEL_SLOT, 33, 34) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(DDPTItems.ACID_BUCKET.get());
            }
        });

        this.addSlot(new Slot(container, AcidVatEntity.FOSSIL_SLOT, 79, 17) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(DDPTTags.Items.DINO_BONES); //TODO (EVNGLX): check w/ DRGN if this has every bone valid for this slot
            }
        });

        this.addSlot(new Slot(container, AcidVatEntity.TISSUE_SLOT, 56, 51) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return false;
            }
        });

        this.addSlot(new Slot(container, AcidVatEntity.BONEMEAL_SLOT, 102, 51) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return false;
            }
        });

        int playerSlots = 0;
        for(int x = 0; x < 9; x++) {
            this.addSlot(new Slot(inventory, playerSlots++, 8 + x * 18, 142));
        }

        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                this.addSlot(new Slot(inventory, playerSlots++, 8 + x * 18, 84 + y * 18));
            }
        }

        this.addDataSlots(this.data);
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }


    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        Slot slot = this.slots.get(i);
        if(!slot.hasItem()) {
            return ItemStack.EMPTY;
        }

        ItemStack itemStack = slot.getItem();
        ItemStack itemStackCopy = itemStack.copy();
        if(i < 4) {
            if(!this.moveItemStackTo(itemStack, 4, 40, false)) {
                return ItemStack.EMPTY;
            }
        } else if(i < 40) {
            if(!this.moveItemStackTo(itemStack, 0, 4, false)) {
                return ItemStack.EMPTY;
            }
        }

        if(itemStack.getCount() == 0) {
            slot.set(ItemStack.EMPTY);
        }
        slot.setChanged();
        return itemStackCopy;
    }
}