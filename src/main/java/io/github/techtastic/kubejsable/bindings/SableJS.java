package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.companion.SubLevelAccess;
import dev.ryanhcode.sable.companion.math.BoundingBox3dc;
import dev.ryanhcode.sable.companion.math.JOMLConversion;
import dev.ryanhcode.sable.sublevel.SubLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;

public class SableJS<L extends Level, S extends SubLevel> {
    public Iterable<SubLevel> getAllIntersecting(final L level, final BoundingBox3dc bounds) {
        return Sable.HELPER.getAllIntersecting(level, bounds);
    }

    public S getContaining(final L level, final int chunkX, final int chunkZ) {
        return (S) Sable.HELPER.getContaining(level, chunkX, chunkZ);
    }

    public S getContaining(final L level, final Vec3i pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }

    public S getContaining(final L level, final Vec3 pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }

    public S getContaining(final Entity entity) {
        return (S) Sable.HELPER.getContaining(entity);
    }

    public S getContaining(final BlockEntity blockEntity) {
        return (S) Sable.HELPER.getContaining(blockEntity);
    }

    public Vec3 projectOutOfSubLevel(final L level, final Vec3 pos) {
        return Sable.HELPER.projectOutOfSubLevel(level, pos);
    }

    public @Nullable <T, S extends SubLevelAccess> T runIncludingSubLevels(final L level, final Vec3 origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, T> converter) {
        return Sable.HELPER.runIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public <S extends SubLevelAccess> boolean findIncludingSubLevels(final L level, final Vec3 origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, Boolean> converter) {
        return Sable.HELPER.findIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public double distanceSquaredWithSubLevels(final L level, final Vec3 a, final Vec3 b) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, a, b);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final Vec3 a, final Vec3 b) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, a, b);
    }

    public Vec3 getVelocity(final L level, final Vec3 pos) {
        return Sable.HELPER.getVelocity(level, pos);
    }

    public Vec3 getVelocity(final L level, final SubLevelAccess subLevel, final Vec3 pos) {
        return Sable.HELPER.getVelocity(level, subLevel, pos);
    }

    public Vec3 getVelocityRelativeToAir(final L level, final Vec3 pos) {
        return Sable.HELPER.getVelocityRelativeToAir(level, pos);
    }

    public boolean isInPlotGrid(final L level, final int chunkX, final int chunkZ) {
        return Sable.HELPER.isInPlotGrid(level, chunkX, chunkZ);
    }

    public @Nullable SubLevel getTrackingSubLevel(final Entity entity) {
        return Sable.HELPER.getTrackingSubLevel(entity);
    }

    public @Nullable SubLevel getLastTrackingSubLevel(final Entity entity) {
        return Sable.HELPER.getLastTrackingSubLevel(entity);
    }

    public @Nullable SubLevel getTrackingOrVehicleSubLevel(final Entity entity) {
        return Sable.HELPER.getTrackingOrVehicleSubLevel(entity);
    }

    public @Nullable SubLevel getVehicleSubLevel(final Entity entity) {
        return Sable.HELPER.getVehicleSubLevel(entity);
    }

    public @NotNull Vec3 getEyePositionInterpolated(final Entity entity, final float partialTicks) {
        return Sable.HELPER.getEyePositionInterpolated(entity, partialTicks);
    }

    public @NotNull Vec3 getFeetPos(final Entity entity, final float distanceDown) {
        return JOMLConversion.toMojang(Sable.HELPER.getFeetPos(entity, distanceDown));
    }
}
