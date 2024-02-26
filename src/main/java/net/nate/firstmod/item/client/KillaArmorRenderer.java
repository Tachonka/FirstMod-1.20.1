package net.nate.firstmod.item.client;

import net.nate.firstmod.item.custom.KillaArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KillaArmorRenderer extends GeoArmorRenderer<KillaArmorItem> {
    public KillaArmorRenderer() {
        super(new KillaArmorModel());
    }
}
