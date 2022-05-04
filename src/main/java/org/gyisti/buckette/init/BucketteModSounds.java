
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BucketteModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("buckette", "far-away_mk2"), new SoundEvent(new ResourceLocation("buckette", "far-away_mk2")));
		REGISTRY.put(new ResourceLocation("buckette", "kirby_gour"), new SoundEvent(new ResourceLocation("buckette", "kirby_gour")));
		REGISTRY.put(new ResourceLocation("buckette", "explosion1"), new SoundEvent(new ResourceLocation("buckette", "explosion1")));
		REGISTRY.put(new ResourceLocation("buckette", "anbience1"), new SoundEvent(new ResourceLocation("buckette", "anbience1")));
		REGISTRY.put(new ResourceLocation("buckette", "calm4.ogg"), new SoundEvent(new ResourceLocation("buckette", "calm4.ogg")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
