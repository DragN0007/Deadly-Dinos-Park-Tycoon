package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import com.dragn0007.deadlydinospt.client.menu.EmbryoInjectorMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.DDPTTags;
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

public class EmbryoInjectorEntity extends BaseContainerBlockEntity {
    public static final int MAX_INJECT_TIME = 20 * 10;
    public static final int EMBRYO_SLOT = 0;
    public static final int EGG_SLOT = 1;
    public static final int DINO_EGG_SLOT = 2;

    public static final int INJECTOR_CHANCE = 75; // 75%


    public NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);
    public int injectTime = 0;
    public final ContainerData containerData = new ContainerData() {
        @Override
        public int get(int i) {
            return EmbryoInjectorEntity.this.injectTime;
        }

        @Override
        public void set(int i, int value) {
            EmbryoInjectorEntity.this.injectTime = value;
        }

        @Override
        public int getCount() {
            return 1;
        }
    };

    public EmbryoInjectorEntity(BlockPos pos, BlockState state) {
        super(DDPTBlockEntities.EMBRYO_INJECTOR.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return new TranslatableComponent("container.embryo_injector");
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new EmbryoInjectorMenu(containerId, inventory, this, this.containerData);
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
        if(i != DINO_EGG_SLOT && !isSameItem) {
            this.injectTime = 0;
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

    public static void tick(Level level, BlockPos pos, BlockState state, EmbryoInjectorEntity injectorEntity) {
        if(level.isClientSide) {
            return;
        }

        if(injectorEntity.injectTime == MAX_INJECT_TIME) {
            if(level.random.nextInt(100) <= INJECTOR_CHANCE) {
                CompoundTag speciesTag = injectorEntity.getItem(EMBRYO_SLOT).getOrCreateTag();
                ItemStack egg = DDPTTags.Items.fossilTagToEgg(speciesTag);
                if(injectorEntity.getItem(DINO_EGG_SLOT).isEmpty()) {
                    injectorEntity.setItem(DINO_EGG_SLOT, egg);
                } else if(ItemStack.isSameItemSameTags(injectorEntity.getItem(DINO_EGG_SLOT), egg)) {
                    injectorEntity.getItem(DINO_EGG_SLOT).grow(1);
                }
            }

            injectorEntity.getItem(EMBRYO_SLOT).shrink(1);
            injectorEntity.getItem(EGG_SLOT).shrink(1);
            injectorEntity.injectTime = 0;
            setChanged(level, pos, state);
        } else if(injectorEntity.injectTime < MAX_INJECT_TIME
                && injectorEntity.getItem(EMBRYO_SLOT).is(DDPTItems.EMBRYO.get())
                && injectorEntity.getItem(EGG_SLOT).is(Items.TURTLE_EGG)
                && injectorEntity.getItem(DINO_EGG_SLOT).getCount() < injectorEntity.getItem(DINO_EGG_SLOT).getMaxStackSize()
                && (injectorEntity.getItem(DINO_EGG_SLOT).isEmpty() ||
                    ItemStack.isSame(DDPTTags.Items.fossilTagToEgg(injectorEntity.getItem(EMBRYO_SLOT).getTag()), injectorEntity.getItem(DINO_EGG_SLOT)))
        ) {
            injectorEntity.injectTime++;
            setChanged(level, pos, state);
        }
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        ContainerHelper.loadAllItems(compoundTag, this.items);
        this.injectTime = compoundTag.getInt("InjectTime");
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        ContainerHelper.saveAllItems(compoundTag, this.items);
        compoundTag.putInt("InjectTime", this.injectTime);
    }
}
