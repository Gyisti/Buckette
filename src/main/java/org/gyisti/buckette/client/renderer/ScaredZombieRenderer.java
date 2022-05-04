
package org.gyisti.buckette.client.renderer;

import org.gyisti.buckette.entity.ScaredZombieEntity;
import org.gyisti.buckette.client.model.Modelzombie;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ScaredZombieRenderer extends MobRenderer<ScaredZombieEntity, Modelzombie<ScaredZombieEntity>> {
	public ScaredZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombie(context.bakeLayer(Modelzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScaredZombieEntity entity) {
		return new ResourceLocation("buckette:textures/skin_zombie.png");
	}
}
