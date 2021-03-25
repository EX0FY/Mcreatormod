
package net.mcreator.remeke.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.remeke.RemekeModElements;

@RemekeModElements.ModElement.Tag
public class RubypicturePainting extends RemekeModElements.ModElement {
	public RubypicturePainting(RemekeModElements instance) {
		super(instance, 1);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("rubypicture"));
	}
}
