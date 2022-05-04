/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package org.gyisti.buckette;

import org.gyisti.buckette.init.BucketteModTabs;
import org.gyisti.buckette.init.BucketteModParticleTypes;
import org.gyisti.buckette.init.BucketteModItems;
import org.gyisti.buckette.init.BucketteModFeatures;
import org.gyisti.buckette.init.BucketteModEntities;
import org.gyisti.buckette.init.BucketteModBlocks;
import org.gyisti.buckette.init.BucketteModBiomes;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("buckette")
public class BucketteMod {
	public static final Logger LOGGER = LogManager.getLogger(BucketteMod.class);
	public static final String MODID = "buckette";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public BucketteMod() {
		BucketteModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BucketteModBlocks.REGISTRY.register(bus);
		BucketteModItems.REGISTRY.register(bus);
		BucketteModEntities.REGISTRY.register(bus);

		BucketteModFeatures.REGISTRY.register(bus);

		BucketteModBiomes.REGISTRY.register(bus);
		BucketteModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
