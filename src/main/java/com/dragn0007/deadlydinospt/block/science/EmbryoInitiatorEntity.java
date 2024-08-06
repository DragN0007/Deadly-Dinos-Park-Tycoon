package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import com.dragn0007.deadlydinospt.client.menu.EmbryoInitiatorMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class EmbryoInitiatorEntity extends BaseContainerBlockEntity {
    public static final int MAX_INITIALIZATION_TIME = 20 * 10;
    public static final int TOP_SLOT = 0;
    public static final int MIDDLE_SLOT = 1;
    public static final int BOTTOM_SLOT = 2;
    public static final int PETRI_SLOT = 3;
    public static final int TEST_TUBE_SLOT = 4;
    public static final int EMBRYO_SLOT = 5;

    public static final int INITIALIZATION_CHANCE = 25; // 25%


    public NonNullList<ItemStack> items = NonNullList.withSize(6, ItemStack.EMPTY);
    public int initializationTime = 0;
    public final ContainerData containerData = new ContainerData() {
        @Override
        public int get(int i) {
            return EmbryoInitiatorEntity.this.initializationTime;
        }

        @Override
        public void set(int i, int value) {
            EmbryoInitiatorEntity.this.initializationTime = value;
        }

        @Override
        public int getCount() {
            return 1;
        }
    };

    public EmbryoInitiatorEntity(BlockPos pos, BlockState state) {
        super(DDPTBlockEntities.EMBRYO_INITIATOR.get(), pos, state);
    }

    @Override
    public Component getDefaultName() {
        return new TranslatableComponent("container.embryo_initiator");
    }

    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new EmbryoInitiatorMenu(containerId, inventory, this, this.containerData);
    }

    @Override
    public int getContainerSize() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemStack : this.items) {
            if (!itemStack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getItem(int i) {
        return this.items.get(i);
    }

    @Override
    public ItemStack removeItem(int i, int j) {
        return ContainerHelper.removeItem(this.items, i, j);
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        return ContainerHelper.takeItem(this.items, i);
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        this.items.set(i, itemStack);
        if (itemStack.getCount() > this.getMaxStackSize()) {
            itemStack.setCount(this.getMaxStackSize());
        }

        ItemStack currentItemStack = this.items.get(i);
        boolean isSameItem = !itemStack.isEmpty() && itemStack.sameItem(currentItemStack) && ItemStack.tagMatches(itemStack, currentItemStack);
        if(i != EMBRYO_SLOT && !isSameItem) {
            this.initializationTime = 0;
            this.setChanged();
        }
    }

    @Override
    public boolean stillValid(Player player) {
        if (this.level != null && this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return player.distanceToSqr(this.worldPosition.getX() + 0.5D, this.worldPosition.getY() + 0.5D, this.worldPosition.getZ() + 0.5D) <= 64.0D;
        }
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }

    public static void tick(Level level, BlockPos pos, BlockState state, EmbryoInitiatorEntity initiatorEntity) {
        if(level.isClientSide) {
            return;
        }

        if(initiatorEntity.initializationTime == MAX_INITIALIZATION_TIME) {
            if(level.random.nextInt(100) <= INITIALIZATION_CHANCE) {
                System.out.println("reach");
                CompoundTag speciesTag = initiatorEntity.getItem(PETRI_SLOT).getOrCreateTag();
                ItemStack embryoItem = new ItemStack(DDPTItems.EMBRYO.get());
                embryoItem.getOrCreateTag().merge(speciesTag);

                if(initiatorEntity.getItem(EMBRYO_SLOT).isEmpty()) {
                    initiatorEntity.setItem(EMBRYO_SLOT, embryoItem);
                } else if(ItemStack.isSameItemSameTags(initiatorEntity.getItem(EMBRYO_SLOT), embryoItem)) {
                    initiatorEntity.getItem(EMBRYO_SLOT).grow(1);
                }
            }

            initiatorEntity.getItem(TEST_TUBE_SLOT).shrink(1);
            initiatorEntity.getItem(PETRI_SLOT).shrink(1);
            initiatorEntity.getItem(TOP_SLOT).shrink(1);
            initiatorEntity.getItem(MIDDLE_SLOT).shrink(1);
            initiatorEntity.getItem(BOTTOM_SLOT).shrink(1);
            initiatorEntity.initializationTime = 0;
            setChanged(level, pos, state);
        } else if(initiatorEntity.initializationTime < MAX_INITIALIZATION_TIME
                && (initiatorEntity.getItem(TOP_SLOT).is(Items.CHICKEN) || initiatorEntity.getItem(TOP_SLOT).is(Items.FEATHER) || initiatorEntity.getItem(TOP_SLOT).is(Items.EGG))
                && (initiatorEntity.getItem(MIDDLE_SLOT).is(Items.CHICKEN) || initiatorEntity.getItem(MIDDLE_SLOT).is(Items.FEATHER) || initiatorEntity.getItem(MIDDLE_SLOT).is(Items.EGG))
                && (initiatorEntity.getItem(BOTTOM_SLOT).is(Items.CHICKEN) || initiatorEntity.getItem(BOTTOM_SLOT).is(Items.FEATHER) || initiatorEntity.getItem(BOTTOM_SLOT).is(Items.EGG))
                && initiatorEntity.getItem(PETRI_SLOT).is(DDPTItems.DNA_PETRI_DISH.get())
                && initiatorEntity.getItem(TEST_TUBE_SLOT).is(DDPTItems.TEST_TUBE.get())
                && initiatorEntity.getItem(EMBRYO_SLOT).getCount() < initiatorEntity.getItem(EMBRYO_SLOT).getMaxStackSize()
                && (initiatorEntity.getItem(EMBRYO_SLOT).isEmpty() ||
                        ItemStack.tagMatches(initiatorEntity.getItem(PETRI_SLOT), initiatorEntity.getItem(EMBRYO_SLOT)))
        ) {
            initiatorEntity.initializationTime++;
            setChanged(level, pos, state);
        }
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        ContainerHelper.loadAllItems(compoundTag, this.items);
        this.initializationTime = compoundTag.getInt("InitializationTime");
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        ContainerHelper.saveAllItems(compoundTag, this.items);
        compoundTag.putInt("InitializationTime", this.initializationTime);
    }
}
