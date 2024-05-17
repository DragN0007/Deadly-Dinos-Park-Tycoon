package com.dragn0007.deadlydinospt.entity.carni;

import com.dragn0007.deadlydinospt.client.model.SpinoModel;
import com.dragn0007.deadlydinospt.entity.ai.DinoMeleeGoal;
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
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
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
import net.minecraft.world.level.pathfinder.AmphibiousNodeEvaluator;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.phys.Vec3;
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

public class Spino extends TamableAnimal implements IAnimatable {

    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public Spino(EntityType<? extends Spino> entityType, Level level) {
        super(entityType, level);
        this.noCulling = true;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 100)
                .add(Attributes.ATTACK_DAMAGE, 10)
                .add(Attributes.MOVEMENT_SPEED, 0.23)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1)
                ;
    }

    public boolean isPushedByFluid() {
        return false;
    }
    public boolean canBreatheUnderwater() {
        return true;
    }
    protected boolean canRandomSwim() {
        return true;
    }
    static class SpinoSwimGoal extends RandomSwimmingGoal {
        private final Spino spino;
        public SpinoSwimGoal(Spino p_27505_) {
            super(p_27505_, 1.0D, 40);
            this.spino = p_27505_;
        }
        public boolean canUse() {
            return this.spino.canRandomSwim() && super.canUse();
        }
    }

    public static final Predicate<LivingEntity> PREY_SELECTOR = (p_30437_) -> {
        EntityType<?> entitytype = p_30437_.getType();
        return
                entitytype == EntityTypes.ARCHAE_ENTITY.get()
                        || entitytype == EntityTypes.AVA_ENTITY.get()
                        || entitytype == EntityTypes.ALLO_ENTITY.get()
                        || entitytype == EntityTypes.CERATO_ENTITY.get()
                        || entitytype == EntityTypes.ANDAL_ENTITY.get()
                        || entitytype == EntityTypes.GRYPO_ENTITY.get()
                        || entitytype == EntityTypes.AMARGA_ENTITY.get()
                        || entitytype == EntityTypes.AMPELO_ENTITY.get()
                        || entitytype == EntityType.PLAYER
                        || entitytype == EntityType.CAT
                        || entitytype == EntityType.WOLF
                        || entitytype == EntityType.HORSE
                        || entitytype == EntityType.MULE
                        || entitytype == EntityType.DONKEY
                        || entitytype == EntityType.SHEEP
                        || entitytype == EntityType.COW
                        || entitytype == EntityType.CHICKEN
                        || entitytype == EntityType.PIG
                ;
    };

    @Override
    public float getStepHeight() {
        return 1f;
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new BreathAirGoal(this));
        this.goalSelector.addGoal(0, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, 15, true, true, LivingEntity::attackable));
        this.goalSelector.addGoal(1, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(4, new FollowBoatGoal(this));
        this.goalSelector.addGoal(0, new DinoMeleeGoal(this, 1, true));
        this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
        this.goalSelector.addGoal(4, new SpinoSwimGoal(this));
        this.goalSelector.addGoal(3, new SpinoStrollOnLandGoal(this, 1.0D, 100));

        this.targetSelector.addGoal(1, new NonTameRandomTargetGoal<>(this, LivingEntity.class, false, PREY_SELECTOR));
        this.targetSelector.addGoal(0, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(0, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));

        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, true, new Predicate<LivingEntity>() {
            @Override
            public boolean test(@Nullable LivingEntity livingEntity) {
                if (livingEntity instanceof Mahakala)
                    return false;
                if (livingEntity instanceof Spino)
                    return false;
                
                if (livingEntity instanceof ArmorStand)
                    return false;
                if (livingEntity instanceof AbstractFish)
                    return false;
                if (livingEntity instanceof Player) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Ava) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Cerato) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Andal) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Grypo) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Amarga) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Ampelo) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Archae) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Cat) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Wolf) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Horse) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Mule) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Donkey) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Sheep) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Cow) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Chicken) //<- taken care of by the prey selector
                    return false;
                if (livingEntity instanceof Pig) //<- taken care of by the prey selector
                    return false;
                return true;
            }
        }));
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.TURTLE_AMBIENT_LAND;
    }
    protected SoundEvent getDeathSound () {
        return SoundEvents.PHANTOM_DEATH;
    }
    @Nullable
    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.POLAR_BEAR_WARNING;
    }
    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        this.playSound(SoundEvents.POLAR_BEAR_STEP, 0.15F, 0.5F);
    }


    //Animation
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (isInWater()) {
            if (!event.isMoving()) {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("swimidle", ILoopType.EDefaultLoopTypes.LOOP));
                return PlayState.CONTINUE;
            } else {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("swim", ILoopType.EDefaultLoopTypes.LOOP));
                return PlayState.CONTINUE;
            }
        }

        if (event.isMoving()) {
            if (isAggressive()) {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("run", ILoopType.EDefaultLoopTypes.LOOP));
            } else {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", ILoopType.EDefaultLoopTypes.LOOP));
            }
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
        }

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
    private static final Ingredient FOOD_ITEMS = Ingredient.of(DDPTTags.Items.FISH);
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



    static class SpinoStrollOnLandGoal extends RandomStrollGoal {
        private final Spino spino;

        SpinoStrollOnLandGoal(Spino p_30303_, double p_30304_, int p_30305_) {
            super(p_30303_, p_30304_, p_30305_);
            this.spino = p_30303_;
        }

        public boolean canUse() {
            return !this.mob.isInWater() && super.canUse();
        }
    }

    static class SpinoPathNav extends WaterBoundPathNavigation {
        SpinoPathNav(Spino p_30294_, Level p_30295_) {
            super(p_30294_, p_30295_);
        }

        protected boolean canUpdatePath() {
            return true;
        }

        protected PathFinder createPathFinder(int p_30298_) {
            this.nodeEvaluator = new AmphibiousNodeEvaluator(true);
            return new PathFinder(this.nodeEvaluator, p_30298_);
        }

        public boolean isStableDestination(BlockPos p_30300_) {
            if (this.mob instanceof Spino) {
                Spino spino = (Spino)this.mob;
            }

            return !this.level.getBlockState(p_30300_.below()).isAir();
        }
    }

    public void travel(Vec3 p27490) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(0.7F, p27490);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0D));
            if (this.getTarget() == null) {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
            } else {
                if (this.getTarget().isAlive() && this.canAttack(this.getTarget())) {
                    Vec3 targetPos = new Vec3(this.getTarget().getX(), this.getTarget().getY(), this.getTarget().getZ());
                    this.moveTowardsTarget(targetPos);
                } else {
                    this.setTarget(null);
                }
            }
        } else {
            super.travel(p27490);
        }
    }

    private void moveTowardsTarget(Vec3 targetPos) {
        double dx = targetPos.x - this.getX();
        double dy = targetPos.y - this.getY();
        double dz = targetPos.z - this.getZ();

        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        double speed = 0.1;
        dx /= distance;
        dy /= distance;
        dz /= distance;

        this.setDeltaMovement(dx * speed, dy * speed, dz * speed);
    }


    //Generates variant textures

    public ResourceLocation getTextureLocation() {
        return SpinoModel.Variant.variantFromOrdinal(getVariant()).resourceLocation;
    }


    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Spino.class, EntityDataSerializers.INT);

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

        setVariant(new Random().nextInt(SpinoModel.Variant.values().length));

        return super.finalizeSpawn(levelAccessor, difficultyInstance, mobSpawnType, spawnGroupData, compoundTag);
    }

    public boolean canBeParent() {
        return !this.isBaby() && this.getHealth() >= this.getMaxHealth() && this.isInLove();
    }
    @Override
    public boolean canMate(Animal animal) {
        if (animal == this || !(animal instanceof Spino)) {
            return false;
        } else {
            return this.canBeParent() && ((Spino)animal).canBeParent();
        }
    }
    @Override
    public Spino getBreedOffspring(ServerLevel level, AgeableMob ageableMob) {
        return EntityTypes.SPINO_ENTITY.get().create(level);
    }

    @Override
    protected void defineSynchedData(){
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

}