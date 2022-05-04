
package org.gyisti.buckette.item;

import org.gyisti.buckette.init.BucketteModTabs;
import org.gyisti.buckette.init.BucketteModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BedrockSwordItem extends SwordItem {
	public BedrockSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 12245;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 26f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BucketteModItems.BEDROCK_ORE_1.get()));
			}
		}, 3, 0f, new Item.Properties().tab(BucketteModTabs.TAB_BUCKETTE).fireResistant());
	}
}
