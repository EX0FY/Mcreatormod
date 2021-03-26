
package net.mcreator.remeke.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.remeke.itemgroup.VkladkaItemGroup;
import net.mcreator.remeke.RemekeModElements;

@RemekeModElements.ModElement.Tag
public class FoodItem extends RemekeModElements.ModElement {
	@ObjectHolder("remeke:food")
	public static final Item block = null;
	public FoodItem(RemekeModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(VkladkaItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("food");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 5;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
