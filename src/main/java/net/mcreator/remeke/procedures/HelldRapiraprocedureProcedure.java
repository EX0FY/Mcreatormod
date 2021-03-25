package net.mcreator.remeke.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.remeke.RemekeModElements;

import java.util.Map;

@RemekeModElements.ModElement.Tag
public class HelldRapiraprocedureProcedure extends RemekeModElements.ModElement {
	public HelldRapiraprocedureProcedure(RemekeModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure HelldRapiraprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEAD) : false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
	}
}
