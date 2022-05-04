
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.client.particle.VoidNearParticlesParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BucketteModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) BucketteModParticleTypes.VOID_NEAR_PARTICLES.get(),
				VoidNearParticlesParticle::provider);
	}
}
