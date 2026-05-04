package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.api.SubLevelHelper;
import dev.ryanhcode.sable.companion.math.JOMLConversion;
import dev.ryanhcode.sable.sublevel.SubLevel;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;
import org.joml.Vector3dc;

import java.util.Collection;
import java.util.Objects;

public class SubLevelHelperJS<S extends SubLevel, L extends Level> {
    public Collection<SubLevel> getConnectedChain(S subLevel) {
        return SubLevelHelper.getConnectedChain(subLevel);
    }

    public Vec3 getVelocityRelativeToAir(L level, Vec3 pos) {
        return JOMLConversion.toMojang(SubLevelHelper.getVelocityRelativeToAir(level, JOMLConversion.toJOML(pos), new Vector3d()));
    }

    public void popEntityLocal(S subLevel, Entity player) {
        SubLevelHelper.popEntityLocal(subLevel, player);
    }

    public void popEntityLocal(S subLevel, Entity entity, EntityAnchorArgument.Anchor anchor) {
        SubLevelHelper.popEntityLocal(subLevel, entity, anchor);
    }

    public void pushEntityLocal(S subLevel, Entity entity) {
        SubLevelHelper.pushEntityLocal(subLevel, entity);
    }

    public void pushEntityLocal(S subLevel, Entity entity, EntityAnchorArgument.Anchor anchor) {
        SubLevelHelper.pushEntityLocal(subLevel, entity, anchor);
    }
}
