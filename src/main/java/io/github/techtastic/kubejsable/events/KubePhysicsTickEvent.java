package io.github.techtastic.kubejsable.events;

import dev.latvian.mods.kubejs.event.KubeEvent;
import dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem;

public class KubePhysicsTickEvent implements KubeEvent {
    public final SubLevelPhysicsSystem physicsSystem;
    public final double timeStep;

    public KubePhysicsTickEvent(SubLevelPhysicsSystem physicsSystem, double timeStep) {
        this.physicsSystem = physicsSystem;
        this.timeStep = timeStep;
    }
}
