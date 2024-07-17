package com.dragn0007.deadlydinospt.entity.carni;

import com.dragn0007.deadlydinospt.client.model.MajungaModel;
import com.dragn0007.deadlydinospt.entity.ai.DinoWeakMeleeGoal;
import com.dragn0007.deadlydinospt.entity.herbi.Amarga;
import com.dragn0007.deadlydinospt.entity.herbi.Ampelo;
import com.dragn0007.deadlydinospt.entity.herbi.Ava;
import com.dragn0007.deadlydinospt.entity.herbi.Grypo;
import com.dragn0007.deadlydinospt.entity.util.EntityTypes;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Mule;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.event.ForgeEventFactory;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public class Majunga extends TamableAnimal implements IAnimatable {

    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public Majunga(EntityType<? extends Majunga> entityType, Level level) {
        super(entityType, level);
        this.noCulling = true;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60)
                .add(Attributes.ATTACK_DAMAGE, 6)
                .add(Attributes.MOVEMENT_SPEED, 0.23)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.5)
                ;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.PANDA_AGGRESSIVE_AMBIENT;
    }
    protected SoundEvent getDeathSound () {
        return SoundEvents.PHANTOM_DEATH;
    }
    @Nullable
    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.POLAR_BEAR_WARNING;
    }
    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        this.playSound(SoundEvents.POLAR_BEAR_STEP, 0.15F, 1.0F);
    }

    public static final Predicate<LivingEntity> PREY_SELECTOR = (entity) -> {
        if (entity instanceof TamableAnimal && ((TamableAnimal) entity).isTame()) {
            return false;
        }
        if (entity.getType() == EntityType.PLAYER) {
            return false;
        }
        if (entity.getType() == EntityTypes.MAJUNGA_ENTITY.get()) {
            return false;
        }
        return true;
    };
    @Override
    public float getStepHeight() {
        return 1f;
    }
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, 40, true, true, LivingEntity::attackable));
        this.goalSelector.addGoal(2, new BreakDoorGoal(this, (x) -> x == Difficulty.EASY || x == Difficulty.NORMAL || x == Difficulty.HARD));
        this.goalSelector.addGoal(0, new DinoWeakMeleeGoal(this, 1.6, true));
        this.goalSelector.addGoal(4, new FloatGoal(this));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this, 1));

        this.targetSelector.addGoal(1, new NonTameRandomTargetGoal<>(this, LivingEntity.class, false, PREY_SELECTOR));
        this.targetSelector.addGoal(0, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(0, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));

        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, true, new Predicate<LivingEntity>() {
            @Override
            public boolean test(@Nullable LivingEntity livingEntity) {
                if (livingEntity
                        instanceof Majunga
                        || livingEntity instanceof Mahakala
                        || livingEntity instanceof ArmorStand
                        || livingEntity instanceof AbstractFish
                        || livingEntity instanceof Squid
                        || livingEntity instanceof Dolphin
                        || livingEntity instanceof TamableAnimal
                ){
                    return false;
                }
                return true;
            }
        }));
    }


    //Animation
    private <E extends IAnimatable>PlayState predicate(AnimationEvent<E> event) {

        if (event.isMoving()) {
            if (isAggressive() || isSprinting()) {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("run", ILoopType.EDefaultLoopTypes.LOOP));

            } else
                event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", ILoopType.EDefaultLoopTypes.LOOP));
        } else
            event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));

        return PlayState.CONTINUE;
    }

    private PlayState attackPredicate(AnimationEvent event) {
        if (this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("attack", ILoopType.EDefaultLoopTypes.PLAY_ONCE));
            this.swinging = false;
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers (AnimationData data){
        data.addAnimationController(new AnimationController(this, "controller", 3, this::predicate));
        data.addAnimationController(new AnimationController(this, "attackController", 1, this::attackPredicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return FOOD_ITEMS.test(itemStack);
    }
    private static final Ingredient FOOD_ITEMS = Ingredient.of(DDPTTags.Items.MEATS);
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (this.isTame()) {
            if (this.isFood(itemStack)) {
                if (this.getHealth() < this.getMaxHealth()) {
                    // heal
                    this.usePlayerItem(player, hand, itemStack);
                    this.heal(itemStack.getFoodProperties(this).getNutrition());
                    this.gameEvent(GameEvent.MOB_INTERACT, this.eyeBlockPosition());
                    return InteractionResult.sidedSuccess(this.level.isClientSide);
                } else if (this.canFallInLove() && !this.level.isClientSide) {
                    // set to baby maker mode
                    this.usePlayerItem(player, hand, itemStack);
                    this.setInLove(player);
                    this.gameEvent(GameEvent.MOB_INTERACT, this.eyeBlockPosition());
                    return InteractionResult.SUCCESS;
                }
            }
        } else if (this.isFood(itemStack) && !this.level.isClientSide && this.isBaby()) {
            this.usePlayerItem(player, hand, itemStack);
            // try to tame (33% chance to succeed)
            if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
                this.tame(player);
                return InteractionResult.SUCCESS;
            }

            if(this.isBaby()) {
                // grow baby
                this.ageUp(itemStack.getFoodProperties(this).getNutrition());
                this.gameEvent(GameEvent.MOB_INTERACT, this.eyeBlockPosition());
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.sidedSuccess(this.level.isClientSide);
    }

    //Generates variant textures

    public ResourceLocation getTextureLocation() {
        return MajungaModel.Variant.variantFromOrdinal(getVariant()).resourceLocation;
    }


    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Majunga.class, EntityDataSerializers.INT);

    public int getVariant(){
        return this.entityData.get(VARIANT);
    }

    public void setVariant(int variant) {
        this.entityData.set(VARIANT, variant);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundNBT) {
        super.readAdditionalSaveData(compoundNBT);
        if(compoundNBT.contains("Variant")) {
            setVariant(compoundNBT.getInt("Variant"));
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundNBT) {
        super.addAdditionalSaveData(compoundNBT);
        compoundNBT.putInt("Variant", getVariant());
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor levelAccessor, DifficultyInstance difficultyInstance, MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {

        setVariant(new Random().nextInt(MajungaModel.Variant.values().length));

        return super.finalizeSpawn(levelAccessor, difficultyInstance, mobSpawnType, spawnGroupData, compoundTag);
    }

    public boolean canBeParent() {
        return !this.isBaby() && this.getHealth() >= this.getMaxHealth() && this.isInLove();
    }
    @Override
    public boolean canMate(Animal animal) {
        if (animal == this || !(animal instanceof Majunga)) {
            return false;
        } else {
            return this.canBeParent() && ((Majunga)animal).canBeParent();
        }
    }
    @Override
    public Majunga getBreedOffspring(ServerLevel level, AgeableMob ageableMob) {
        return EntityTypes.MAJUNGA_ENTITY.get().create(level);
    }


    @Override
    protected void defineSynchedData(){
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

}