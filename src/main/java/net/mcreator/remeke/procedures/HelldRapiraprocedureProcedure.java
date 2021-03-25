package net.mcreator.remeke.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.passive.horse.ZombieHorseEntity;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.Entity;

import net.mcreator.remeke.GrandcraftModElements;

import java.util.Map;

@GrandcraftModElements.ModElement.Tag
public class HelldRapiraprocedureProcedure extends GrandcraftModElements.ModElement {
	public HelldRapiraprocedureProcedure(GrandcraftModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure HelldRapiraprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof CreeperEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof ZombieHorseEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof ZombieVillagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof ZombieEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof SpiderEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof SkeletonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof SkeletonHorseEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof EndermanEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof EndermiteEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
		if ((entity instanceof EnderDragonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			entity.setFire((int) 8);
		}
	}
}
