package io.github.techtastic.kubejsable.bindings;

import dev.ryanhcode.sable.sublevel.plot.heat.SubLevelHeatMapManager;

public class SubLevelHeatMapManagerJS {
    public void addSplitListener(final SubLevelHeatMapManager.SplitListener listener) {
        SubLevelHeatMapManager.addSplitListener(listener);
    }
}
