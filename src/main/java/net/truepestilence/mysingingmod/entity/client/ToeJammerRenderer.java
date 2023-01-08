package net.truepestilence.mysingingmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.truepestilence.mysingingmod.MySingingMod;
import net.truepestilence.mysingingmod.entity.custom.ToeJammerEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ToeJammerRenderer extends GeoEntityRenderer<ToeJammerEntity> {
    public ToeJammerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ToeJammerModel());
        this.shadowRadius = 0.75f;
    }

    @Override
    public ResourceLocation getTextureLocation(ToeJammerEntity animatable) {
        return new ResourceLocation(MySingingMod.MOD_ID, "textures/entity/toejammer.png");
    }

    @Override
    public RenderType getRenderType(ToeJammerEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
