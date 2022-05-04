
package org.gyisti.buckette.client.renderer;

import org.gyisti.buckette.entity.DiamondMinecartEntity;
import org.gyisti.buckette.client.model.Modelminecart;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DiamondMinecartRenderer extends MobRenderer<DiamondMinecartEntity, Modelminecart<DiamondMinecartEntity>> {
	public DiamondMinecartRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminecart(context.bakeLayer(Modelminecart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiamondMinecartEntity entity) {
		return new ResourceLocation("buckette:textures/minecart2.png");
	}
}
