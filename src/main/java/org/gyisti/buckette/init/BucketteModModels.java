
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.client.model.Modelzombie;
import org.gyisti.buckette.client.model.Modelwolf;
import org.gyisti.buckette.client.model.Modelvillagerreencoded;
import org.gyisti.buckette.client.model.Modelsteve;
import org.gyisti.buckette.client.model.Modelminecart;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BucketteModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelwolf.LAYER_LOCATION, Modelwolf::createBodyLayer);
		event.registerLayerDefinition(Modelzombie.LAYER_LOCATION, Modelzombie::createBodyLayer);
		event.registerLayerDefinition(Modelvillagerreencoded.LAYER_LOCATION, Modelvillagerreencoded::createBodyLayer);
		event.registerLayerDefinition(Modelminecart.LAYER_LOCATION, Modelminecart::createBodyLayer);
	}
}
