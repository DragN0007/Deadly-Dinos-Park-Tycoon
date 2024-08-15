package com.dragn0007.deadlydinospt.entity.marine.base;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public abstract class AbstractNeutralMarineDino extends WaterAnimal {

    public AbstractNeutralMarineDino(EntityType<? extends AbstractNeutralMarineDino> entityType, Level level) {
        super(entityType, level);
        this.moveControl = new FishMoveControl(this);
        this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
    }

    public int getMaxSpawnClusterSize() {
        return 4;
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new SharkMeleeAttackGoal());
        this.goalSelector.addGoal(4, new SharkSwimGoal(this));
        this.targetSelector.addGoal(1, new SharkHurtByTargetGoal());
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
    }

    protected PathNavigation createNavigation(Level p_27480_) {
        return new WaterBoundPathNavigation(this, p_27480_);
    }

    public void travel(Vec3 p27490) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(0.7F, p27490);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0D));
            if (this.getTarget() == null) {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(p27490);
        }
    }

    public void aiStep() {
        if (!this.isInWater() && this.onGround && this.verticalCollision) {
            this.setDeltaMovement(this.getDeltaMovement().add((double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F), (double)0.4F, (double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F)));
            this.onGround = false;
            this.hasImpulse = true;
            this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
        }

        super.aiStep();
    }

    static class FishMoveControl extends MoveControl {
        private final AbstractNeutralMarineDino shark;

        FishMoveControl(AbstractNeutralMarineDino p_27501_) {
            super(p_27501_);
            this.shark = p_27501_;
        }

        public void tick() {
            if (this.shark.isEyeInFluid(FluidTags.WATER)) {
                this.shark.setDeltaMovement(this.shark.getDeltaMovement().add(0.0D, 0.005D, 0.0D));
            }

            if (this.operation == Operation.MOVE_TO && !this.shark.getNavigation().isDone()) {
                float f = (float)(this.speedModifier * this.shark.getAttributeValue(Attributes.MOVEMENT_SPEED));
                this.shark.setSpeed(Mth.lerp(0.125F, this.shark.getSpeed(), f));
                double d0 = this.wantedX - this.shark.getX();
                double d1 = this.wantedY - this.shark.getY();
                double d2 = this.wantedZ - this.shark.getZ();
                if (d1 != 0.0D) {
                    double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                    this.shark.setDeltaMovement(this.shark.getDeltaMovement().add(0.0D, (double)this.shark.getSpeed() * (d1 / d3) * 0.1D, 0.0D));
                }

                if (d0 != 0.0D || d2 != 0.0D) {
                    float f1 = (float)(Mth.atan2(d2, d0) * (double)(180F / (float)Math.PI)) - 90.0F;
                    this.shark.setYRot(this.rotlerp(this.shark.getYRot(), f1, 90.0F));
                    this.shark.yBodyRot = this.shark.getYRot();
                }

            } else {
                this.shark.setSpeed(0.0F);
            }
        }
    }

    public void tick() {
        super.tick();
            if (this.level.isClientSide && this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.03D) {
                Vec3 vec3 = this.getViewVector(0.0F);
                float f = Mth.cos(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;
                float f1 = Mth.sin(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;
                float f2 = 1.2F - this.random.nextFloat() * 0.7F;

                for(int i = 0; i < 2; ++i) {
                    this.level.addParticle(ParticleTypes.DOLPHIN, this.getX() - vec3.x * (double)f2 + (double)f, this.getY() - vec3.y, this.getZ() - vec3.z * (double)f2 + (double)f1, 0.0D, 0.0D, 0.0D);
                    this.level.addParticle(ParticleTypes.DOLPHIN, this.getX() - vec3.x * (double)f2 - (double)f, this.getY() - vec3.y, this.getZ() - vec3.z * (double)f2 - (double)f1, 0.0D, 0.0D, 0.0D);
                }
            }
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    public boolean isSwimming() {
        return true;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    protected SoundEvent getAmbientSound() {
        return null;
    }

    protected SoundEvent getDeathSound() {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.RAVAGER_HURT;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.ELDER_GUARDIAN_FLOP;
    }

    protected boolean canRandomSwim() {
        return true;
    }


    protected SoundEvent getSwimSound() {
        return SoundEvents.FISH_SWIM;
    }

    protected void playStepSound(BlockPos p_27482_, BlockState p_27483_) {
    }

    public boolean doHurtTarget(Entity p_29522_) {
        boolean flag = p_29522_.hurt(DamageSource.mobAttack(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
        if (flag) {
            this.doEnchantDamageEffects(this, p_29522_);
        }

        return flag;
    }
    class SharkHurtByTargetGoal extends HurtByTargetGoal {
        public SharkHurtByTargetGoal() {
            super(AbstractNeutralMarineDino.this);
        }

        protected void alertOther(Mob p_29580_, LivingEntity p_29581_) {
            if (p_29580_ instanceof AbstractNeutralMarineDino && !p_29580_.isBaby()) {
                super.alertOther(p_29580_, p_29581_);
            }

        }
    }
    class SharkMeleeAttackGoal extends MeleeAttackGoal {
        public SharkMeleeAttackGoal() {
            super(AbstractNeutralMarineDino.this, 5D, true);
        }
        protected void checkAndPerformAttack(LivingEntity p_29589_, double p_29590_) {
            double d0 = this.getAttackReachSqr(p_29589_);
            if (p_29590_ <= d0 && this.isTimeToAttack()) {
                this.resetAttackCooldown();
                this.mob.doHurtTarget(p_29589_);
            } else if (p_29590_ <= d0 * 2.0D) {
                if (this.isTimeToAttack()) {

                    this.resetAttackCooldown();
                }
                if (this.getTicksUntilNextAttack() <= 10) {
                }
            } else {
                this.resetAttackCooldown();
            }

        }
    }

    static class SharkSwimGoal extends RandomSwimmingGoal {
        public final AbstractNeutralMarineDino fish;

        public SharkSwimGoal(AbstractNeutralMarineDino p_27505_) {
            super(p_27505_, 1.0D, 40);
            this.fish = p_27505_;
        }

        public boolean canUse() {
            return this.fish.canRandomSwim() && super.canUse();
        }
    }
}

