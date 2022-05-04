
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.client.renderer.ScaredZombieRenderer;
import org.gyisti.buckette.client.renderer.GrimmRenderer;
import org.gyisti.buckette.client.renderer.DrTrayaurusRenderer;
import org.gyisti.buckette.client.renderer.DiamondMinecartRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BucketteModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BucketteModEntities.DR_TRAYAURUS.get(), DrTrayaurusRenderer::new);
		event.registerEntityRenderer(BucketteModEntities.DIAMOND_MINECART.get(), DiamondMinecartRenderer::new);
		event.registerEntityRenderer(BucketteModEntities.GRIMM.get(), GrimmRenderer::new);
		event.registerEntityRenderer(BucketteModEntities.SCARED_ZOMBIE.get(), ScaredZombieRenderer::new);
	}
}
