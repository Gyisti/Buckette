
package org.gyisti.buckette.item;

import org.gyisti.buckette.init.BucketteModTabs;
import org.gyisti.buckette.init.BucketteModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FarAwayMK2Item extends RecordItem {
	public FarAwayMK2Item() {
		super(0, BucketteModSounds.REGISTRY.get(new ResourceLocation("buckette:far-away_mk2")),
				new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE).stacksTo(1).rarity(Rarity.RARE));
	}
}
