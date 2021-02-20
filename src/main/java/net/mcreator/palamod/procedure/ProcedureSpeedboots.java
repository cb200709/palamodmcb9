package net.mcreator.palamod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureSpeedboots extends ElementsPalamodMod.ModElement {
	public ProcedureSpeedboots(ElementsPalamodMod instance) {
		super(instance, 107);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Speedboots!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 900, (int) 1, (false), (false)));
	}
}
