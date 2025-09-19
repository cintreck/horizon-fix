# Horizon Fix (Fabric)

Horizon Fix removes the unnecessary ring emitted from the Sun & Moon that ruins the look of the sky when contrasted against the terrain. Made to **not** conflict with any other mods like [Smooth Skies](https://modrinth.com/mod/smooth-skies).

![Before & After](https://cdn.modrinth.com/data/cached_images/4423d17405a9924c3f93fe74cf13a009e4972cbd_0.webp)

## Features
- Leaves other dimensions and custom fog providers untouched; pure client-side tweak.
- No configuration required and no runtime dependencies beyond Fabric API.

## Install
- Requires [Fabric](https://fabricmc.net/) and [Fabric API](https://modrinth.com/mod/fabric-api).
- Client-only; servers never need this jar.

## Build
- Java 21 with Gradle + Fabric Loom.
- Versions live in `gradle.properties`. Run `./gradlew build`.

## License
- CC0-1.0. Use it freely.
