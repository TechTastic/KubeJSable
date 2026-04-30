package io.github.techtastic.kubejsable.bindings;

import dev.latvian.mods.kubejs.typings.Info;
import dev.latvian.mods.kubejs.typings.Param;
import dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics;
import dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysicsData;
import net.minecraft.world.level.Level;
import org.joml.Vector3dc;
import org.joml.Vector3fc;

public class DimensionPhysicsJS<L extends Level> {
    @Info(
            value = "Retrieves the physics data record of the dimension",
            params = {
                    @Param(name = "level", value = "The Level to retrieve the physics data record from")
            }
    )
    public DimensionPhysics of(L level) {
        return DimensionPhysicsData.of(level);
    }

    @Info(
            value = "Retrieves the default physics data record of the dimension",
            params = {
                    @Param(name = "level", value = "The Level to retrieve the default physics data record from")
            }
    )
    public DimensionPhysics getDefault(L level) {
        return DimensionPhysicsData.getDefault(level);
    }

    @Info(
            value = "Retrieves the magnetic north vector of the dimension",
            params = {
                    @Param(name = "level", value = "The Level to retrieve the magnetic north vector from")
            }
    )
    public Vector3fc getMagneticNorth(L level) {
        return DimensionPhysicsData.getMagneticNorth(level);
    }

    @Info(
            value = "Retrieves the gravity vector of the dimension",
            params = {
                    @Param(name = "level", value = "The Level to retrieve the gravity vector from")
            }
    )
    public Vector3dc getGravity(L level) {
        return DimensionPhysicsData.getGravity(level);
    }
}
