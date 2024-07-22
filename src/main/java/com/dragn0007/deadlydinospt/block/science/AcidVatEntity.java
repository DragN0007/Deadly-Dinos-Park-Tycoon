package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import com.dragn0007.deadlydinospt.client.menu.AcidVatMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Random;
public class AcidVatEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public AcidVatEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(DDPTBlockEntities.ACID_VAT.get(), pWorldPosition, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Acid Vat");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new AcidVatMenu(pContainerId, pInventory, this);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }


    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, AcidVatEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
            craftItem(pBlockEntity);
        }
    }

    private static void craftItem(AcidVatEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);
        entity.itemHandler.extractItem(1, 1, false);
        entity.itemHandler.getStackInSlot(2).hurt(1, new Random(), null);

        entity.itemHandler.setStackInSlot(3, new ItemStack(DDPTItems.FOSSILIZED_SOFT_TISSUE.get(),
                entity.itemHandler.getStackInSlot(3).getCount() + 1));
    }

    private static boolean hasRecipe(AcidVatEntity entity) {
        boolean hasItemInWaterSlot = PotionUtils.getPotion(entity.itemHandler.getStackInSlot(0)) == Potions.WATER;
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(1).getItem() == DDPTItems.DILOPHOSAURUS_FOSSIL_SKULL.get();
        boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(2).getItem() == DDPTItems.ACID_BUCKET.get();

        return hasItemInWaterSlot && hasItemInFirstSlot && hasItemInSecondSlot;
    }

    private static boolean hasNotReachedStackLimit(AcidVatEntity entity) {
        return entity.itemHandler.getStackInSlot(3).getCount() < entity.itemHandler.getStackInSlot(3).getMaxStackSize();
    }
}




//    public AcidVat() {
//        super(NORTH, EAST, SOUTH, WEST);
//    }
//    public static final VoxelShape NORTH = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
//
//    public static final VoxelShape EAST = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//
//    public static final VoxelShape SOUTH = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//
//    public static final VoxelShape WEST = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//}
