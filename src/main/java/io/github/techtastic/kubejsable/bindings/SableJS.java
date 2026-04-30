package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.api.SubLevelHelper;
import dev.ryanhcode.sable.api.entity.EntitySubLevelUtil;
import dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle;
import dev.ryanhcode.sable.api.sublevel.ServerSubLevelContainer;
import dev.ryanhcode.sable.api.sublevel.SubLevelContainer;
import dev.ryanhcode.sable.companion.SubLevelAccess;
import dev.ryanhcode.sable.companion.math.BoundingBox3dc;
import dev.ryanhcode.sable.companion.math.JOMLConversion;
import dev.ryanhcode.sable.companion.math.Pose3dc;
import dev.ryanhcode.sable.mixinterface.entity.entity_sublevel_collision.EntityMovementExtension;
import dev.ryanhcode.sable.sublevel.ClientSubLevel;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.core.SectionPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;
import org.joml.Vector3dc;

import java.util.function.BiFunction;

public class SableJS<L extends Level, S extends SubLevel> {
    public Iterable<SubLevel> getAllIntersecting(final L level, final BoundingBox3dc bounds) {
        return Sable.HELPER.getAllIntersecting(level, bounds);
    }

    public S getContaining(final L level, final int chunkX, final int chunkZ) {
        return (S) Sable.HELPER.getContaining(level, chunkX, chunkZ);
    }

    public S getContaining(final L level, final ChunkPos chunkPos) {
        return (S) Sable.HELPER.getContaining(level, chunkPos);
    }

    public S getContaining(final L level, final SectionPos pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }

    public S getContaining(final L level, final Vec3i pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }

    public S getContaining(final L level, final Position pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }
    
    public S getContaining(final L level, final Vector3dc pos) {
        return (S) Sable.HELPER.getContaining(level, pos);
    }

    public S getContaining(final L level, final double blockX, final double blockZ) {
        return (S) Sable.HELPER.getContaining(level, blockX, blockZ);
    }

    public S getContaining(final Entity entity) {
        return (S) Sable.HELPER.getContaining(entity);
    }

    public S getContaining(final BlockEntity blockEntity) {
        return (S) Sable.HELPER.getContaining(blockEntity);
    }

    public Vector3d projectOutOfSubLevel(final L level, final Vector3dc pos, final Vector3d dest) {
        return Sable.HELPER.projectOutOfSubLevel(level, pos, dest);
    }

    public Vec3 projectOutOfSubLevel(final L level, final Vec3 pos) {
        return Sable.HELPER.projectOutOfSubLevel(level, pos);
    }

    public Vec3 projectOutOfSubLevel(final L level, final Position pos) {
        return Sable.HELPER.projectOutOfSubLevel(level, pos);
    }

    public @Nullable <T, S extends SubLevelAccess> T runIncludingSubLevels(final L level, final Vec3 origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, T> converter) {
        return Sable.HELPER.runIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public @Nullable <T, S extends SubLevelAccess> T runIncludingSubLevels(final L level, final Position origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, T> converter) {
        return Sable.HELPER.runIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public <S extends SubLevelAccess> boolean findIncludingSubLevels(final L level, final Vec3 origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, Boolean> converter) {
        return Sable.HELPER.findIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public <S extends SubLevelAccess> boolean findIncludingSubLevels(final L level, final Position origin, final boolean shouldCheckOrigin, @Nullable final S subLevel, final BiFunction<S, BlockPos, Boolean> converter) {
        return Sable.HELPER.findIncludingSubLevels(level, origin, shouldCheckOrigin, subLevel, converter);
    }

    public double distanceSquaredWithSubLevels(final L level, final Vector3dc a, final Vector3dc b) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, a, b);
    }

    public double distanceSquaredWithSubLevels(final L level, final Position a, final Position b) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, a, b);
    }

    public double distanceSquaredWithSubLevels(final L level, final Vector3dc a, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, a, bX, bY, bZ);
    }

    public double distanceSquaredWithSubLevels(final L level, final Position a, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, a, bX, bY, bZ);
    }

    public double distanceSquaredWithSubLevels(final L level, final double aX, final double aY, final double aZ, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.distanceSquaredWithSubLevels(level, aX, aY, aZ, bX, bY, bZ);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final Vector3dc a, final Vector3dc b) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, a, b);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final Position a, final Position b) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, a, b);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final Vector3dc a, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, a, bX, bY, bZ);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final Position a, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, a, bX, bY, bZ);
    }

    public double rectilinearDistanceWithSubLevels(final L level, final double aX, final double aY, final double aZ, final double bX, final double bY, final double bZ) {
        return Sable.HELPER.rectilinearDistanceWithSubLevels(level, aX, aY, aZ, bX, bY, bZ);
    }

    public Vector3d getVelocity(final L level, final Vector3dc pos, final Vector3d dest) {
        return Sable.HELPER.getVelocity(level, pos, dest);
    }

    public Vec3 getVelocity(final L level, final Vec3 pos) {
        return Sable.HELPER.getVelocity(level, pos);
    }

    public Vec3 getVelocity(final L level, final Position pos) {
        return Sable.HELPER.getVelocity(level, pos);
    }

    public Vector3d getVelocity(final L level, final SubLevelAccess subLevel, final Vector3dc pos, final Vector3d dest) {
        return Sable.HELPER.getVelocity(level, subLevel, pos, dest);
    }

    public Vec3 getVelocity(final L level, final SubLevelAccess subLevel, final Vec3 pos) {
        return Sable.HELPER.getVelocity(level, subLevel, pos);
    }

    public Vec3 getVelocity(final L level, final SubLevelAccess subLevel, final Position pos) {
        return Sable.HELPER.getVelocity(level, subLevel, pos);
    }

    public Vector3d getVelocityRelativeToAir(final L level, final Vector3dc pos, final Vector3d dest) {
        return Sable.HELPER.getVelocityRelativeToAir(level, pos, dest);
    }

    public Vec3 getVelocityRelativeToAir(final L level, final Vec3 pos) {
        return Sable.HELPER.getVelocityRelativeToAir(level, pos);
    }

    public Vec3 getVelocityRelativeToAir(final L level, final Position pos) {
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

    public @NotNull Vector3d getFeetPos(final Entity entity, final float distanceDown) {
        return Sable.HELPER.getFeetPos(entity, distanceDown);
    }
}
