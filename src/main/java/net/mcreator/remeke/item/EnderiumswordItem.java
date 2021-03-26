
package net.mcreator.remeke.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.remeke.itemgroup.VkladkaItemGroup;
import net.mcreator.remeke.RemekeModElements;

@RemekeModElements.ModElement.Tag
public class EnderiumswordItem extends RemekeModElements.ModElement {
	@ObjectHolder("remeke:enderiumsword")
	public static final Item block = null;
	public EnderiumswordItem(RemekeModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiumingotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(VkladkaItemGroup.tab)) {
		}.setRegistryName("enderiumsword"));
	}
}
