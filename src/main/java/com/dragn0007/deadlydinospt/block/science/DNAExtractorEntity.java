package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import com.dragn0007.deadlydinospt.client.menu.DNAExtractorMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;


public class DNAExtractorEntity extends BaseContainerBlockEntity {
    public static final int MAX_EXTRACT_TIME = 20 * 10;
    public static final int PETRI_SLOT = 0;
    public static final int TISSUE_SLOT = 1;
    public static final int DNA_PETRI_SLOT = 2;

    public static final int EXTRACTION_CHANCE_FOSSIL = DeadlyDinosPTCommonConfig.DNA_EXTRACTOR_FOSSIL_SUCCESS_RATE.get(); // 33%, by default
    public static final int EXTRACTION_CHANCE_BONE = DeadlyDinosPTCommonConfig.DNA_EXTRACTOR_BONE_SUCCESS_RATE.get(); // 50%, by default


    public NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);
    public int extractTime = 0;
    public final ContainerData containerData = new ContainerData() {
        @Override
        public int get(int i) {
            return DNAExtractorEntity.this.extractTime;
        }

        @Override
        public void set(int i, int value) {
            DNAExtractorEntity.this.extractTime = value;
        }

        @Override
        public int getCount() {
            return 1;
        }
    };

    public DNAExtractorEntity(BlockPos pos, BlockState state) {
        super(DDPTBlockEntities.DNA_EXTRACTOR.get(), pos, state);
    }

    @Override
    public Component getDefaultName() {
        return new TranslatableComponent("container.dna_extractor");
    }

    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new DNAExtractorMenu(containerId, inventory, this, this.containerData);
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
        if(i != DNA_PETRI_SLOT && !isSameItem) {
            this.extractTime = 0;
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

    public static void tick(Level level, BlockPos pos, BlockState state, DNAExtractorEntity extractorEntity) {
        if(level.isClientSide) {
            return;
        }

        if(extractorEntity.extractTime == MAX_EXTRACT_TIME) {
            if(level.random.nextInt(100) <= EXTRACTION_CHANCE_FOSSIL) {
                CompoundTag speciesTag = extractorEntity.getItem(TISSUE_SLOT).getOrCreateTag();
                ItemStack DNAPetriItem = new ItemStack(DDPTItems.DNA_PETRI_DISH.get());
                DNAPetriItem.getOrCreateTag().merge(speciesTag);

                if(extractorEntity.getItem(DNA_PETRI_SLOT).isEmpty()) {
                    extractorEntity.setItem(DNA_PETRI_SLOT, DNAPetriItem);
                } else if(ItemStack.isSameItemSameTags(extractorEntity.getItem(DNA_PETRI_SLOT), DNAPetriItem)){
                    extractorEntity.getItem(DNA_PETRI_SLOT).grow(1);
                }
            }

            extractorEntity.getItem(PETRI_SLOT).shrink(1);
            extractorEntity.getItem(TISSUE_SLOT).shrink(1);
            extractorEntity.extractTime = 0;
            setChanged(level, pos, state);
        } else if(extractorEntity.extractTime < MAX_EXTRACT_TIME
                && extractorEntity.getItem(PETRI_SLOT).is(DDPTItems.PETRI_DISH.get())
                && extractorEntity.getItem(TISSUE_SLOT).is(DDPTItems.FOSSILIZED_SOFT_TISSUE.get())
                && extractorEntity.getItem(DNA_PETRI_SLOT).getCount() < extractorEntity.getItem(DNA_PETRI_SLOT).getMaxStackSize()
                && (extractorEntity.getItem(DNA_PETRI_SLOT).isEmpty() ||
                        ItemStack.tagMatches(extractorEntity.getItem(TISSUE_SLOT), extractorEntity.getItem(DNA_PETRI_SLOT)))
        ) {
            extractorEntity.extractTime++;
            setChanged(level, pos, state);
        }

    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        ContainerHelper.loadAllItems(compoundTag, this.items);
        this.extractTime = compoundTag.getInt("ExtractTime");
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        ContainerHelper.saveAllItems(compoundTag, this.items);
        compoundTag.putInt("ExtractTime", this.extractTime);
    }
}