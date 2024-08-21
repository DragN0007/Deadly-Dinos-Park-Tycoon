package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import com.dragn0007.deadlydinospt.client.menu.AcidVatMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.lang.reflect.Type;

public class AcidVatEntity extends BaseContainerBlockEntity implements MenuProvider {
    public static final int MAX_BOIL_TIME = 20 * 10;
    public static final int MAX_ACID_LEVEL = 16;
    public static final int FUEL_SLOT = 0;
    public static final int FOSSIL_SLOT = 1;
    public static final int TISSUE_SLOT = 2;
    public static final int BONEMEAL_SLOT = 3;

    public static final int TISSUE_CHANCE_FOSSIL = DeadlyDinosPTCommonConfig.ACID_VAT_FOSSIL_SUCCESS_RATE.get(); // 33%, by default
    public static final int TISSUE_CHANCE_BONE = DeadlyDinosPTCommonConfig.ACID_VAT_BONE_SUCCESS_RATE.get(); // 50%, by default


    public NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);
    public int acidLevel = 0;
    public int boilTime = 0;

    public final ContainerData containerData = new ContainerData() {
        @Override
        public int get(int index) {
            switch(index) {
                case 0: return AcidVatEntity.this.acidLevel;
                case 1: return AcidVatEntity.this.boilTime;
            }
            return 0;
        }

        @Override
        public void set(int index, int value) {
            switch(index) {
                case 0:
                    AcidVatEntity.this.acidLevel = value;
                    break;
                case 1:
                    AcidVatEntity.this.boilTime = value;
                    break;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    };

    public AcidVatEntity(BlockPos pos, BlockState state) {
        super(DDPTBlockEntities.ACID_VAT.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return new TranslatableComponent("container.acid_vat");
    }

    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new AcidVatMenu(containerId, inventory, this, this.containerData);
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
        if(i != TISSUE_SLOT && i != BONEMEAL_SLOT && !isSameItem) {
            this.boilTime = 0;
            this.setChanged();
        }
    }

    @Override
    public boolean stillValid(Player player) {
        if (this.level != null && this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return player.distanceToSqr((double)this.worldPosition.getX() + 0.5D, (double)this.worldPosition.getY() + 0.5D, (double)this.worldPosition.getZ() + 0.5D) <= 64.0D;
        }
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }

    public static ItemStack nextTissueResult(AcidVatEntity acidVatEntity) {
        ItemStack fossil = acidVatEntity.getItem(FOSSIL_SLOT);
        CompoundTag tag = DDPTTags.Items.fossilItemToTag(fossil);

        ItemStack possibleTissue = new ItemStack(DDPTItems.FOSSILIZED_SOFT_TISSUE.get());
        possibleTissue.getOrCreateTag().merge(tag);
        return possibleTissue;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, AcidVatEntity acidVatEntity) {
        if(level.isClientSide) {
            return;
        }

        if(acidVatEntity.acidLevel > 0 && acidVatEntity.boilTime == MAX_BOIL_TIME) {
            if(level.random.nextInt(100) <= TISSUE_CHANCE_FOSSIL) {
                ItemStack tissueItem = nextTissueResult(acidVatEntity);
                if(acidVatEntity.getItem(TISSUE_SLOT).isEmpty()) {
                    acidVatEntity.setItem(TISSUE_SLOT, tissueItem);
                } else if(ItemStack.isSameItemSameTags(acidVatEntity.getItem(TISSUE_SLOT), tissueItem)) {
                    acidVatEntity.getItem(TISSUE_SLOT).grow(1);
                }
            }

            int bonemealCount = 1 + level.random.nextInt(2);
            if(acidVatEntity.getItem(BONEMEAL_SLOT).isEmpty()) {
                acidVatEntity.setItem(BONEMEAL_SLOT, new ItemStack(Items.BONE_MEAL, bonemealCount));
            } else {
                acidVatEntity.getItem(BONEMEAL_SLOT).grow(bonemealCount);
            }

            acidVatEntity.getItem(FOSSIL_SLOT).shrink(1);
            acidVatEntity.boilTime = 0;
            acidVatEntity.acidLevel--;
            setChanged(level, pos, state);
        }

        if(acidVatEntity.acidLevel > 0 && acidVatEntity.boilTime < MAX_BOIL_TIME
                && acidVatEntity.getItem(BONEMEAL_SLOT).getCount() < acidVatEntity.getItem(BONEMEAL_SLOT).getMaxStackSize()
                && acidVatEntity.getItem(TISSUE_SLOT).getCount() < acidVatEntity.getItem(TISSUE_SLOT).getMaxStackSize()
                && acidVatEntity.getItem(FOSSIL_SLOT).is(DDPTTags.Items.DINO_BONES)
                && (acidVatEntity.getItem(TISSUE_SLOT).isEmpty() ||
                        ItemStack.isSame(nextTissueResult(acidVatEntity), acidVatEntity.getItem(TISSUE_SLOT)))
        ) {
            acidVatEntity.boilTime++;
            setChanged(level, pos, state);
        }

        if(acidVatEntity.acidLevel == 0 && acidVatEntity.getItem(FUEL_SLOT).is(DDPTItems.ACID_BUCKET.get())) {
            acidVatEntity.acidLevel = MAX_ACID_LEVEL;
            acidVatEntity.getItem(FUEL_SLOT).shrink(1);
            setChanged(level, pos, state);
        }
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        ContainerHelper.loadAllItems(compoundTag, this.items);
        this.acidLevel = compoundTag.getInt("AcidLevel");
        this.boilTime = compoundTag.getInt("BoilTime");
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        ContainerHelper.saveAllItems(compoundTag, this.items);
        compoundTag.putInt("AcidLevel", this.acidLevel);
        compoundTag.putInt("BoilTime", this.boilTime);
    }
}