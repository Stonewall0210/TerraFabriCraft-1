package io.github.bloomhousemc.terrafabricraft.common.registry;

import io.github.bloomhousemc.terrafabricraft.TerraFabriCraft;
import io.github.bloomhousemc.terrafabricraft.client.model.entity.CrabEntityModel;
import io.github.bloomhousemc.terrafabricraft.client.model.entity.RoosterEntityModel;
import io.github.bloomhousemc.terrafabricraft.client.model.entity.YakEntityModel;
import io.github.bloomhousemc.terrafabricraft.client.renderer.entity.CrabEntityRenderer;
import io.github.bloomhousemc.terrafabricraft.client.renderer.entity.RoosterRenderer;
import io.github.bloomhousemc.terrafabricraft.client.renderer.entity.CamelRenderer;
import io.github.bloomhousemc.terrafabricraft.client.renderer.entity.NautilusRenderer;
import io.github.bloomhousemc.terrafabricraft.client.renderer.entity.YakEntityRenderer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class TFCClientRegistry {

    public static final EntityModelLayer CRAB_LAYER = new EntityModelLayer(new Identifier(TerraFabriCraft.MODID, "crab_layer"), "crab_layer");
    public static final EntityModelLayer ROOSTER_LAYER = new EntityModelLayer(new Identifier(TerraFabriCraft.MODID, "rooster_layer"), "rooster_layer");
    public static final EntityModelLayer YAK_LAYER = new EntityModelLayer(new Identifier(TerraFabriCraft.MODID, "yak_layer"), "yak_layer");

    public static void init() {
        EntityRendererRegistry.INSTANCE.register(TFCEntityTypes.CRAB, CrabEntityRenderer::new);
        EntityRendererRegistry.INSTANCE.register(TFCEntityTypes.NAUTILUS, NautilusRenderer::new);
        EntityRendererRegistry.INSTANCE.register(TFCEntityTypes.CAMEL, CamelRenderer::new);
        EntityRendererRegistry.INSTANCE.register(TFCEntityTypes.ROOSTER, RoosterRenderer::new);
        EntityRendererRegistry.INSTANCE.register(TFCEntityTypes.YAK, YakEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(CRAB_LAYER, CrabEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ROOSTER_LAYER, RoosterEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(YAK_LAYER, YakEntityModel::getTexturedModelData);
    }
}
