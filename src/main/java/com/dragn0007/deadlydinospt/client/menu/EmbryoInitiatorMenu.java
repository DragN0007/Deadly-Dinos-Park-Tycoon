package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.science.EmbryoInitiatorEntity;
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
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class EmbryoInitiatorMenu extends AbstractContainerMenu {

    public final Container container;
    public final ContainerData data;

    public EmbryoInitiatorMenu(int containerId, Inventory inventory, FriendlyByteBuf buf) {
        this(containerId, inventory, new SimpleContainer(6), new SimpleContainerData(1));
    }

    public EmbryoInitiatorMenu(int containerId, Inventory inventory, Container container, ContainerData containerData) {
        super(DDPTMenuTypes.EMBRYO_INITIATOR_MENU.get(), containerId);
        this.container = container;
        this.data = containerData;

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.TOP_SLOT, 26, 16) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                if(EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.MIDDLE_SLOT).getItem().sameItem(itemStack) ||
                        EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.BOTTOM_SLOT).getItem().sameItem(itemStack)) {
                    return false;
                } else {
                    return itemStack.is(Items.CHICKEN) || itemStack.is(Items.FEATHER) || itemStack.is(Items.TURTLE_EGG);
                }
            }
        });

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.MIDDLE_SLOT, 26, 34){
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                if(EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.TOP_SLOT).getItem().sameItem(itemStack) ||
                        EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.BOTTOM_SLOT).getItem().sameItem(itemStack)) {
                    return false;
                } else {
                    return itemStack.is(Items.CHICKEN) || itemStack.is(Items.FEATHER) || itemStack.is(Items.TURTLE_EGG);
                }
            }
        });

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.BOTTOM_SLOT, 26, 52){
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                System.out.println(EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.TOP_SLOT).getItem());
                if(EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.TOP_SLOT).getItem().sameItem(itemStack) ||
                        EmbryoInitiatorMenu.this.slots.get(EmbryoInitiatorEntity.MIDDLE_SLOT).getItem().sameItem(itemStack)) {

                    return false;
                } else {
                    return itemStack.is(Items.CHICKEN) || itemStack.is(Items.FEATHER) || itemStack.is(Items.TURTLE_EGG);
                }
            }
        });

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.PETRI_SLOT, 44, 34) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(DDPTItems.DNA_PETRI_DISH.get());
            }
        });

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.TEST_TUBE_SLOT, 62, 34) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(DDPTItems.TEST_TUBE.get());
            }
        });

        this.addSlot(new Slot(container, EmbryoInitiatorEntity.EMBRYO_SLOT, 116, 34) {
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
    @NotNull
    public ItemStack quickMoveStack(Player player, int i) {
        Slot slot = this.slots.get(i);
        if(!slot.hasItem()) {
            return ItemStack.EMPTY;
        }

        ItemStack itemStack = slot.getItem();
        ItemStack itemStackCopy = itemStack.copy();
        if(i < 6) {
            if(!this.moveItemStackTo(itemStack, 6, 42, false)) {
                return ItemStack.EMPTY;
            }
        } else if(i < 42) {
            if(!this.moveItemStackTo(itemStack, 0, 6, false)) {
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
