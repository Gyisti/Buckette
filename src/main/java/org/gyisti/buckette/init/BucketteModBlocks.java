
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.block.BedrockOreBlock;
import org.gyisti.buckette.BucketteMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class BucketteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BucketteMod.MODID);
	public static final RegistryObject<Block> BEDROCK_ORE_BLOCK = REGISTRY.register("bedrock_ore_block", () -> new BedrockOreBlock());
}
