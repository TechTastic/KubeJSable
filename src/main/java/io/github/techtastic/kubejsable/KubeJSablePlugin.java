package io.github.techtastic.kubejsable;

import dev.latvian.mods.kubejs.event.EventGroupRegistry;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingRegistry;
import dev.latvian.mods.kubejs.typings.Info;
import dev.latvian.mods.kubejs.typings.Param;
import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.api.SubLevelHelper;
import dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysicsData;
import dev.ryanhcode.sable.sublevel.ClientSubLevel;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import io.github.techtastic.kubejsable.bindings.*;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import org.joml.Vector3dc;

import java.util.Collection;
import java.util.function.BiFunction;

public class KubeJSablePlugin implements KubeJSPlugin {
    @Override
    public void init() {
        KubeJSPlugin.super.init();
        KubeSableEvents.init();
    }

    @Override
    public void registerBindings(BindingRegistry bindings) {
        switch (bindings.type()) {
            case CLIENT -> {
                bindings.add("DimensionPhysics", new DimensionPhysicsJS<ClientLevel>());
                bindings.add("SubLevelContainer", new SubLevelContainerJS<ClientLevel>());
                bindings.add("SubLevelHelper", new SubLevelHelperJS<ClientSubLevel, ClientLevel>());
                bindings.add("Sable", new SableJS<ClientLevel, ClientSubLevel>());
            }
            case SERVER -> {
                bindings.add("DimensionPhysics", new DimensionPhysicsJS<ServerLevel>() {
                    @Info(
                            value = "Retrieves the universal drag constant of the dimension",
                            params = {
                                    @Param(name = "level", value = "The ServerLevel to retrieve the universal drag constant from")
                            }
                    )
                    public double getUniversalDrag(ServerLevel level) {
                        return DimensionPhysicsData.getUniversalDrag(level);
                    }

                    @Info(
                            value = "Retrieves the air pressure at a given position in the dimension",
                            params = {
                                    @Param(name = "level", value = "The Level to retrieve the air pressure in"),
                                    @Param(name = "position", value = "The position to retrieve the air pressure at")
                            }
                    )
                    public double getAirPressure(ServerLevel level, Vector3dc position) {
                        return DimensionPhysicsData.getAirPressure(level, position);
                    }
                });
                bindings.add("SubLevelContainer", new SubLevelContainerJS<ServerLevel>());
                bindings.add("SubLevelHelper", new SubLevelHelperJS<ServerSubLevel, ServerLevel>() {
                    public Collection<ServerSubLevel> getLoadingDependencyChain(ServerSubLevel subLevel) {
                        return SubLevelHelper.getLoadingDependencyChain(subLevel);
                    }
                });
                bindings.add("SubLevelAssemblyHelper", new SubLevelAssemblyHelperJS());
                bindings.add("SubLevelPhysicsSystem",  new SubLevelPhysicsSystemJS());
                bindings.add("Sable", new SableJS<ServerLevel, ServerSubLevel>());
            }
            case STARTUP -> {
                bindings.add("SubLevelHelper", new SubLevelHelperJS<SubLevel, Level>() {
                    public void registerWindProvider(BiFunction<Vector3dc, Level, Vector3dc> function) {
                        SubLevelHelper.registerWindProvider(function);
                    }
                });
                bindings.add("SubLevelHeatMapManager", new SubLevelHeatMapManagerJS());
                bindings.add("Sable", new SableJS<>());
            }
        }
    }

    @Override
    public void registerEvents(EventGroupRegistry registry) {
        KubeJSPlugin.super.registerEvents(registry);
        registry.register(KubeSableEvents.GROUP);
    }
}
