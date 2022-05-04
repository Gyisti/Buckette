
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BucketteModTabs {
	public static CreativeModeTab TAB_BUCKETTE;
	public static CreativeModeTab TAB_BUCKETTE_MOB;

	public static void load() {
		TAB_BUCKETTE = new CreativeModeTab("tabbuckette") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BucketteModItems.BUCKETTE_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BUCKETTE_MOB = new CreativeModeTab("tabbuckette_mob") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.VILLAGER_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
