package net.mcreator.palamod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureHasteleggins extends ElementsPalamodMod.ModElement {
	public ProcedureHasteleggins(ElementsPalamodMod instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Hasteleggins!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 900, (int) 2, (false), (false)));
	}
}
