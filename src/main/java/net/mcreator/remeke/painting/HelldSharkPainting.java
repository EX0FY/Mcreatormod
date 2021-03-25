
package net.mcreator.remeke.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.remeke.GrandcraftModElements;

@GrandcraftModElements.ModElement.Tag
public class HelldSharkPainting extends GrandcraftModElements.ModElement {
	public HelldSharkPainting(GrandcraftModElements instance) {
		super(instance, 2);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("helld_shark"));
	}
}
