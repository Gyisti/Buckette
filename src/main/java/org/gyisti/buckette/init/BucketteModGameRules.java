
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BucketteModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DOSPAWNVOIDNEARPARTICLES = GameRules.register("doSpawnVoidNearParticles",
			GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
