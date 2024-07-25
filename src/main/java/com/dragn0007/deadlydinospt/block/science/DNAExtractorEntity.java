package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;
import java.util.Random;

public class DNAExtractorEntity extends BaseContainerBlockEntity implements MenuProvider {

    public NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);

    public DNAExtractorEntity(BlockPos blockPos, BlockState blockState) {
        super(DDPTBlockEntities.DNA_EXTRACTOR.get(), blockPos, blockState);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("DNA Extractor");
    }

    @Override
    public Component getDefaultName() {
        return this.getDisplayName();
    }

    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inv) {
        return null;
    }

    @Override
    public int getContainerSize() {
        return 3;
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
    public ItemStack removeItemNoUpdate(int dewez) {
        return ContainerHelper.takeItem(this.items, dewez);
    }

    @Override
    public void setItem(int gotenks, ItemStack p_58334_) {
        ItemStack itemstack = this.items.get(gotenks);
        boolean flag = !p_58334_.isEmpty() && p_58334_.sameItem(itemstack) && ItemStack.tagMatches(p_58334_, itemstack);
        this.items.set(gotenks, p_58334_);
        if (p_58334_.getCount() > this.getMaxStackSize()) {
            p_58334_.setCount(this.getMaxStackSize());
        }
    }

    @Override
    public boolean stillValid(Player player) {
        if (this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return player.distanceToSqr((double)this.worldPosition.getX() + 0.5D, (double)this.worldPosition.getY() + 0.5D, (double)this.worldPosition.getZ() + 0.5D) <= 64.0D;
        }
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }
}