// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminecart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minecart"), "main");
	private final ModelPart bottom;
	private final ModelPart front;
	private final ModelPart back;
	private final ModelPart right;
	private final ModelPart left;

	public Modelminecart(ModelPart root) {
		this.bottom = root.getChild("bottom");
		this.front = root.getChild("front");
		this.back = root.getChild("back");
		this.right = root.getChild("right");
		this.left = root.getChild("left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom = partdefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create().texOffs(0, 10).mirror()
						.addBox(-10.0F, -8.0F, -20.0F, 20.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition front = partdefinition.addOrReplaceChild("front",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-8.0F, 15.0F, -1.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition back = partdefinition.addOrReplaceChild("back",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-8.0F, 15.0F, -1.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition right = partdefinition.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-8.0F, 15.0F, -1.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -7.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition left = partdefinition.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-8.0F, 15.0F, -1.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -1.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bottom.render(poseStack, buffer, packedLight, packedOverlay);
		front.render(poseStack, buffer, packedLight, packedOverlay);
		back.render(poseStack, buffer, packedLight, packedOverlay);
		right.render(poseStack, buffer, packedLight, packedOverlay);
		left.render(poseStack, buffer, packedLight, packedOverlay);
	}
}