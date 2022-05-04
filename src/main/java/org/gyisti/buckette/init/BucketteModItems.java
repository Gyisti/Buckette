
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.item.FarAwayMK2Item;
import org.gyisti.buckette.item.Calm4Item;
import org.gyisti.buckette.item.BucketteItemItem;
import org.gyisti.buckette.item.BedrockSwordItem;
import org.gyisti.buckette.item.BedrockOre1Item;
import org.gyisti.buckette.item.BedrockArmorShirtArmorItem;
import org.gyisti.buckette.BucketteMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class BucketteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BucketteMod.MODID);
	public static final RegistryObject<Item> BUCKETTE_ITEM = REGISTRY.register("buckette_item", () -> new BucketteItemItem());
	public static final RegistryObject<Item> DR_TRAYAURUS = REGISTRY.register("dr_trayaurus_spawn_egg",
			() -> new ForgeSpawnEggItem(BucketteModEntities.DR_TRAYAURUS, -3355444, -13395712,
					new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE_MOB)));
	public static final RegistryObject<Item> FAR_AWAY_MK_2 = REGISTRY.register("far_away_mk_2", () -> new FarAwayMK2Item());
	public static final RegistryObject<Item> BEDROCK_ORE_BLOCK = block(BucketteModBlocks.BEDROCK_ORE_BLOCK, BucketteModTabs.TAB_BUCKETTE);
	public static final RegistryObject<Item> BEDROCK_ORE_1 = REGISTRY.register("bedrock_ore_1", () -> new BedrockOre1Item());
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> DIAMOND_MINECART = REGISTRY.register("diamond_minecart_spawn_egg",
			() -> new ForgeSpawnEggItem(BucketteModEntities.DIAMOND_MINECART, -15427144, -1,
					new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE_MOB)));
	public static final RegistryObject<Item> GRIMM = REGISTRY.register("grimm_spawn_egg",
			() -> new ForgeSpawnEggItem(BucketteModEntities.GRIMM, -1, -16777216, new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE_MOB)));
	public static final RegistryObject<Item> SCARED_ZOMBIE = REGISTRY.register("scared_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(BucketteModEntities.SCARED_ZOMBIE, -16724890, -6750106,
					new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE_MOB)));
	public static final RegistryObject<Item> CALM_4 = REGISTRY.register("calm_4", () -> new Calm4Item());
	public static final RegistryObject<Item> BEDROCK_ARMOR_SHIRT_ARMOR_HELMET = REGISTRY.register("bedrock_armor_shirt_armor_helmet",
			() -> new BedrockArmorShirtArmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_ARMOR_SHIRT_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_armor_shirt_armor_chestplate",
			() -> new BedrockArmorShirtArmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_ARMOR_SHIRT_ARMOR_LEGGINGS = REGISTRY.register("bedrock_armor_shirt_armor_leggings",
			() -> new BedrockArmorShirtArmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_ARMOR_SHIRT_ARMOR_BOOTS = REGISTRY.register("bedrock_armor_shirt_armor_boots",
			() -> new BedrockArmorShirtArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
