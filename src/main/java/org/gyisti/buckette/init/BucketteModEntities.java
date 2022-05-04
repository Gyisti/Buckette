
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gyisti.buckette.init;

import org.gyisti.buckette.entity.ScaredZombieEntity;
import org.gyisti.buckette.entity.GrimmEntity;
import org.gyisti.buckette.entity.DrTrayaurusEntity;
import org.gyisti.buckette.entity.DiamondMinecartEntity;
import org.gyisti.buckette.BucketteMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BucketteModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BucketteMod.MODID);
	public static final RegistryObject<EntityType<DrTrayaurusEntity>> DR_TRAYAURUS = register("dr_trayaurus",
			EntityType.Builder.<DrTrayaurusEntity>of(DrTrayaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DrTrayaurusEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DiamondMinecartEntity>> DIAMOND_MINECART = register("diamond_minecart",
			EntityType.Builder.<DiamondMinecartEntity>of(DiamondMinecartEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiamondMinecartEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrimmEntity>> GRIMM = register("grimm",
			EntityType.Builder.<GrimmEntity>of(GrimmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GrimmEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ScaredZombieEntity>> SCARED_ZOMBIE = register("scared_zombie",
			EntityType.Builder.<ScaredZombieEntity>of(ScaredZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScaredZombieEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DrTrayaurusEntity.init();
			DiamondMinecartEntity.init();
			GrimmEntity.init();
			ScaredZombieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DR_TRAYAURUS.get(), DrTrayaurusEntity.createAttributes().build());
		event.put(DIAMOND_MINECART.get(), DiamondMinecartEntity.createAttributes().build());
		event.put(GRIMM.get(), GrimmEntity.createAttributes().build());
		event.put(SCARED_ZOMBIE.get(), ScaredZombieEntity.createAttributes().build());
	}
}
