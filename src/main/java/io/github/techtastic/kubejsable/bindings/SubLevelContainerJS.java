package io.github.techtastic.kubejsable.bindings;

import dev.latvian.mods.kubejs.typings.Info;
import dev.latvian.mods.kubejs.typings.Param;
import dev.ryanhcode.sable.api.sublevel.SubLevelContainer;
import net.minecraft.world.level.Level;

public class SubLevelContainerJS<L extends Level> {
    @Info(
            value = "Retrieves the Sub-Level Container of the dimension",
            params = {
                    @Param(name = "level", value = "The Level to retrieve the Sub-Level Cotainer for")
            }
    )
    public SubLevelContainer getContainer(L level) {
        return SubLevelContainer.getContainer(level);
    }
}
