![KubeJSable logo by johndoe_tech_cookie](https://github.com/TechTastic/KubeJSable/blob/master/src/main/resources/icon.png)

# KubeJSable
KubeJS x Sable Addon!

**KubeJSable** is a KubeJS addon for interacting with **[Sable](https://modrinth.com/mod/sable)**!
This includes multiple new bindings and access to Sable events!

# Features
## Bindings
- **Server**
    - `Sable`
    - `DimensionPhysics`
    - `SubLevelContainer`
    - `SubLevelHelper`
        - With `getLoadingDependencyChain`
    - `SubLevelAssemblyHelper`
    - `SubLevelPhysicsSystem`
- **Client**
    - `Sable`
    - `DimensionPhysics`
    - `SubLevelContainer`
    - `SubLevelHelper`
- **Startup**
    - `Sable`
    - `SubLevelHelper`
        - With `registerWindProvider`
    - `SubLevelHeatMapManager`
## Events
- `PhysicsEvents`
    - `pre` - emitted pre-physics tick
    - `post` - emitted post-physics tick
    - `ready` - emitted after a `SubLevelContainer` is ready