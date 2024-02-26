package net.nate.firstmod.item.client;

import net.minecraft.resources.ResourceLocation;
import net.nate.firstmod.FirstMod;
import net.nate.firstmod.item.custom.KillaArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class KillaArmorModel extends GeoModel<KillaArmorItem> {
    @Override
    public ResourceLocation getModelResource(KillaArmorItem killaArmorItem) {
        return new ResourceLocation(FirstMod.MODID, "geo/killa_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KillaArmorItem killaArmorItem) {
        return new ResourceLocation(FirstMod.MODID, "textures/armor/killa_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KillaArmorItem killaArmorItem) {
        return new ResourceLocation(FirstMod.MODID, "animations/killa_armor.animation.json");
    }
}
