package io.github.techtastic.kubejsable.events;

import dev.latvian.mods.kubejs.event.KubeEvent;
import dev.ryanhcode.sable.api.sublevel.SubLevelContainer;
import net.minecraft.world.level.Level;

public class KubeSubLevelContainerReadyEvent implements KubeEvent {
    public final Level level;
    public final SubLevelContainer subLevelContainer;

    public KubeSubLevelContainerReadyEvent(Level level, SubLevelContainer subLevelContainer) {
        this.level = level;
        this.subLevelContainer = subLevelContainer;
    }
}
