package com.shpouf.artisanalfood.datagen;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class ModBlockShapes {
    private ModBlockShapes() {}

    public static final VoxelShape[] BELL_PEPPER_SHAPES = new VoxelShape[] {
            Block.box(5.0, -1.0, 5.0, 11.0, 3.0, 11.0),   // Âge 0 : Hauteur 4
            Block.box(0.0, -1.0, 0.0, 16.0, 9.0, 16.0),  // Âge 1 : Hauteur 10
            Block.box(0.0, -1.0, 0.0, 16.0, 13.0, 16.0),  // Âge 2 : Hauteur 14
            Block.box(0.0, -1.0, 0.0, 16.0, 14.0, 16.0),  // Âge 3 : Hauteur 15
            Block.box(0.0, -1.0, 0.0, 16.0, 15.0, 16.0)   // Âge 4 : Hauteur 16
    };

    //TODO Faire les autres shapes une fois les textures faites
}
