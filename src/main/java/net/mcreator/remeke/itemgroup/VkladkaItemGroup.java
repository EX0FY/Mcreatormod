
package net.mcreator.remeke.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.remeke.block.WorkbenchmodBlock;
import net.mcreator.remeke.RemekeModElements;

@RemekeModElements.ModElement.Tag
public class VkladkaItemGroup extends RemekeModElements.ModElement {
	public VkladkaItemGroup(RemekeModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvkladka") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WorkbenchmodBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
