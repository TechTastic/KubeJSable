package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.api.SubLevelHelper;
import dev.ryanhcode.sable.sublevel.SubLevel;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;
import org.joml.Vector3dc;

import java.util.Collection;
import java.util.Objects;

public class SubLevelHelperJS<S extends SubLevel, L extends Level> {
    public Collection<SubLevel> getConnectedChain(S subLevel) {
        return SubLevelHelper.getConnectedChain(subLevel);
    }

    public Vector3d getVelocityRelativeToAir(L level, Vector3dc pos, @Nullable Vector3d dest) {
        return SubLevelHelper.getVelocityRelativeToAir(level, pos, Objects.requireNonNullElseGet(dest, Vector3d::new));
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
