
package org.gyisti.buckette.client.renderer;

import org.gyisti.buckette.entity.GrimmEntity;
import org.gyisti.buckette.client.model.Modelwolf;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GrimmRenderer extends MobRenderer<GrimmEntity, Modelwolf<GrimmEntity>> {
	public GrimmRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwolf(context.bakeLayer(Modelwolf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrimmEntity entity) {
		return new ResourceLocation("buckette:textures/wolf_tame2.png");
	}
}
