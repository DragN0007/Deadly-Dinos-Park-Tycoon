package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.block.science.DNAExtractorEntity;
import com.dragn0007.deadlydinospt.client.gui.DDPTMenuTypes;
import com.dragn0007.deadlydinospt.item.DDPTItems;
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
import org.jetbrains.annotations.NotNull;

public class DNAExtractorMenu extends AbstractContainerMenu {

    public final Container container;
    public final ContainerData data;

    public DNAExtractorMenu(int containerId, Inventory inventory, FriendlyByteBuf data) {
        this(containerId, inventory, new SimpleContainer(3), new SimpleContainerData(1));
    }

    public DNAExtractorMenu(int containerId, Inventory inventory, Container container, ContainerData data) {
        super(DDPTMenuTypes.DNA_EXTRACTOR_MENU.get(), containerId);
        this.container = container;
        this.data = data;

        this.addSlot(new Slot(container, DNAExtractorEntity.PETRI_SLOT, 26, 34) {
            @Override
            public boolean mayPlace(@NotNull ItemStack itemStack) {
                return itemStack.is(DDPTItems.PETRI_DISH.get());
            }
        });

        this.addSlot(new Slot(container, DNAExtractorEntity.TISSUE_SLOT, 62, 34) {
            @Override
            public boolean mayPlace(@NotNull ItemStack itemStack) {
                return itemStack.is(DDPTItems.FOSSILIZED_SOFT_TISSUE.get());
            }
        });
        this.addSlot(new Slot(container, DNAExtractorEntity.DNA_PETRI_SLOT, 116, 34) {
            @Override
            public boolean mayPlace(@NotNull ItemStack itemStack) {
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
    public boolean stillValid(@NotNull Player player) {
        return this.container.stillValid(player);
    }

    @Override
    @NotNull
    public ItemStack quickMoveStack(Player player, int i) {
        Slot slot = this.slots.get(i);
        if(!slot.hasItem()) {
            return ItemStack.EMPTY;
        }

        ItemStack itemStack = slot.getItem();
        ItemStack itemStackCopy = itemStack.copy();
        if(i < 3) {
            if(!this.moveItemStackTo(itemStack, 3, 39, false)) {
                return ItemStack.EMPTY;
            }
        } else if(i < 39) {
            if(!this.moveItemStackTo(itemStack, 0, 3, false)) {
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
