package net.inancoldflower.herometer.entity.ai;

import net.inancoldflower.herometer.entity.custom.InkuEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Hand;

public class InkuAttackGoal extends MeleeAttackGoal {
    private final InkuEntity entity;
    private int attackDelay = 20;
    private int tickUntilNextAttack = 20;
    private boolean shouldCountTillnextAttack = false;

    @Override
    public void start() {
        super.start();
        attackDelay = 20;
        tickUntilNextAttack = 20;
    }

    @Override
    protected void attack(LivingEntity target, double squaredDistance) {
        if (isEnemyWithinAttackDistance(target)) {
            shouldCountTillnextAttack = true;

            if(isTimeToStartAttackAnimation()) {
                entity.setAttacking(true);
            }

            if(isTimeToAttack()) {
                this.mob.getLookControl().lookAt(target.getX(), target.getY(), target.getZ());
                performAttack(target);
            }
        } else {
            resetCooldown();
            shouldCountTillnextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }

    public InkuAttackGoal(PathAwareEntity mob, double speed, boolean pauseWhenMobIdle) {
        super(mob, speed, pauseWhenMobIdle);
        entity = ((InkuEntity) mob);
    }

    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy) {
        return this.entity.distanceTo(pEnemy) <= 2f; //
    }

    @Override
    protected void resetCooldown() {
        this.tickUntilNextAttack = this.getTickCount(attackDelay * 2);
    }

    protected boolean isTimeToStartAttackAnimation() { return this.tickUntilNextAttack <= attackDelay;}

    protected boolean isTimeToAttack() { return this.tickUntilNextAttack <= 0;}

    protected void performAttack(LivingEntity pEnemy) {
        this.resetCooldown();
        this.mob.swingHand(Hand.MAIN_HAND);
        this.mob.tryAttack(pEnemy);
    }

    @Override
    public void tick() {
        super.tick();
        if(shouldCountTillnextAttack) {
            this.tickUntilNextAttack = Math.max(this.tickUntilNextAttack - 1, 0);
        }
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}
