package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.api.SubLevelAssemblyHelper;
import dev.ryanhcode.sable.api.physics.PhysicsPipeline;
import dev.ryanhcode.sable.companion.math.BoundingBox3ic;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.Nullable;

public class SubLevelAssemblyHelperJS {
    public ServerSubLevel assembleBlocks(final ServerLevel level, final BlockPos anchor, final Iterable<BlockPos> blocks, final BoundingBox3ic bounds) {
        return SubLevelAssemblyHelper.assembleBlocks(level, anchor, blocks, bounds);
    }

    public void kickFromContainingSubLevel(final ServerLevel level, final SubLevelPhysicsSystem physicsSystem, final PhysicsPipeline pipeline, final ServerSubLevel subLevel, final SubLevel containingSubLevel) {
        SubLevelAssemblyHelper.kickFromContainingSubLevel(level, physicsSystem, pipeline, subLevel, containingSubLevel);
    }

    public SubLevelAssemblyHelper.GatherResult gatherConnectedBlocks(final BlockPos gatherOrigin, final ServerLevel level, final int maximumBlocksToAssemble, @Nullable final SubLevelAssemblyHelper.FrontierPredicate frontierPredicate) {
        return SubLevelAssemblyHelper.gatherConnectedBlocks(gatherOrigin, level, maximumBlocksToAssemble, frontierPredicate);
    }

    public void moveTrackingPoints(final ServerLevel level, final BoundingBox3ic bounds, final ServerSubLevel subLevel, final SubLevelAssemblyHelper.AssemblyTransform transform) {
        SubLevelAssemblyHelper.moveTrackingPoints(level, bounds, subLevel, transform);
    }

    public void moveOtherStuff(final ServerLevel level, final SubLevelAssemblyHelper.AssemblyTransform transform, final Iterable<BlockPos> blocks, final BoundingBox3ic bounds) {
        SubLevelAssemblyHelper.moveOtherStuff(level, transform, blocks, bounds);
    }

    public void moveBlocks(final ServerLevel level, final SubLevelAssemblyHelper.AssemblyTransform transform, final Iterable<BlockPos> blocks) {
        SubLevelAssemblyHelper.moveBlocks(level, transform, blocks);
    }

    public void markAndNotifyBlock(final Level level, final BlockPos pPos, @Nullable final LevelChunk levelchunk, final BlockState oldState, final BlockState newState, final int pFlags, final int pRecursionLeft) {
        SubLevelAssemblyHelper.markAndNotifyBlock(level, pPos, levelchunk, oldState, newState, pFlags, pRecursionLeft);
    }
}
