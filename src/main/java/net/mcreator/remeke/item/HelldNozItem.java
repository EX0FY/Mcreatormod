
package net.mcreator.remeke.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.remeke.itemgroup.VkladkaItemGroup;
import net.mcreator.remeke.RemekeModElements;

import java.util.List;

@RemekeModElements.ModElement.Tag
public class HelldNozItem extends RemekeModElements.ModElement {
	@ObjectHolder("remeke:helld_noz")
	public static final Item block = null;
	public HelldNozItem(RemekeModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HelldshardItem.block, (int) (1)));
			}
		}, 3, -1.4f, new Item.Properties().group(VkladkaItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u0414\u043E\u0432\u043E\u043B\u044C\u043D\u043E \u043F\u0440\u043E\u0441\u0442\u043E\u0435 \u043E\u0440\u0443\u0436\u0438\u0435..."));
			}
		}.setRegistryName("helld_noz"));
	}
}
