
package org.gyisti.buckette.client.renderer;

import org.gyisti.buckette.entity.DrTrayaurusEntity;
import org.gyisti.buckette.client.model.Modelvillagerreencoded;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DrTrayaurusRenderer extends MobRenderer<DrTrayaurusEntity, Modelvillagerreencoded<DrTrayaurusEntity>> {
	public DrTrayaurusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvillagerreencoded(context.bakeLayer(Modelvillagerreencoded.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DrTrayaurusEntity entity) {
		return new ResourceLocation("buckette:textures/plains2.png");
	}
}
