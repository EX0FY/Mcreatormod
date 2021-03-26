
package net.mcreator.remeke.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.remeke.itemgroup.VkladkaItemGroup;
import net.mcreator.remeke.RemekeModElements;

@RemekeModElements.ModElement.Tag
public class HelldshardItem extends RemekeModElements.ModElement {
	@ObjectHolder("remeke:helldshard")
	public static final Item block = null;
	public HelldshardItem(RemekeModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(VkladkaItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("helldshard");
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
	}
}
