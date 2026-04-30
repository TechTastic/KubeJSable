package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem;
import net.minecraft.world.level.Level;

public class SubLevelPhysicsSystemJS {
    public SubLevelPhysicsSystem get(Level level) {
        return SubLevelPhysicsSystem.get(level);
    }

    public SubLevelPhysicsSystem require(Level level) {
        return SubLevelPhysicsSystem.require(level);
    }

    public SubLevelPhysicsSystem getCurrentlySteppingSystem() {
        return SubLevelPhysicsSystem.getCurrentlySteppingSystem();
    }
}
