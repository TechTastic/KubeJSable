package io.github.techtastic.kubejsable;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;
import dev.ryanhcode.sable.neoforge.event.ForgeSablePostPhysicsTickEvent;
import dev.ryanhcode.sable.neoforge.event.ForgeSablePrePhysicsTickEvent;
import dev.ryanhcode.sable.neoforge.event.ForgeSableSubLevelContainerReadyEvent;
import io.github.techtastic.kubejsable.events.KubePhysicsTickEvent;
import io.github.techtastic.kubejsable.events.KubeSubLevelContainerReadyEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = KubeJSable.MODID)
public class KubeSableEvents {
    protected static final EventGroup GROUP = EventGroup.of("PhysicsEvents");

    protected static final EventHandler PRE_PHYSICS_TICK =
            GROUP.server("pre", () -> KubePhysicsTickEvent.class);

    protected static final EventHandler POST_PHYSICS_TICK =
            GROUP.server("post", () -> KubePhysicsTickEvent.class);

    protected static final EventHandler SUBLEVEL_CONTAINER_READY =
            GROUP.server("ready", () -> KubeSubLevelContainerReadyEvent.class);

    protected static void init() {}

    @SubscribeEvent
    public static void onPrePhysicsTick(ForgeSablePrePhysicsTickEvent event) {
        PRE_PHYSICS_TICK.post(new KubePhysicsTickEvent(event.getPhysicsSystem(), event.getTimeStep()));
    }

    @SubscribeEvent
    public static void onPostPhysicsTick(ForgeSablePostPhysicsTickEvent event) {
        POST_PHYSICS_TICK.post(new KubePhysicsTickEvent(event.getPhysicsSystem(), event.getTimeStep()));
    }

    @SubscribeEvent
    public static void onSubLevelContainerReady(ForgeSableSubLevelContainerReadyEvent event) {
        SUBLEVEL_CONTAINER_READY.post(new KubeSubLevelContainerReadyEvent(event.getLevel(), event.getContainer()));
    }
}
