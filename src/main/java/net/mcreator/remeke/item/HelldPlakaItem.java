
package net.mcreator.remeke.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.remeke.itemgroup.TabHelldItemGroup;
import net.mcreator.remeke.RemekeModElements;

import java.util.List;

@RemekeModElements.ModElement.Tag
public class HelldPlakaItem extends RemekeModElements.ModElement {
	@ObjectHolder("remeke:helld_plaka")
	public static final Item block = null;
	public HelldPlakaItem(RemekeModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TabHelldItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("helld_plaka");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u041F\u0430\u043B\u043A\u0430 \u0438\u0437 \u0445\u0435\u043B\u043B\u0434\u0435\u0440\u0438\u0443\u043C\u043E\u0433\u043E \u0436\u0435\u043B\u0435\u0437\u0430."));
		}
	}
}
