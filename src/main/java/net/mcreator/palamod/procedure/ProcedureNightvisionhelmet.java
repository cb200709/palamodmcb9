package net.mcreator.palamod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureNightvisionhelmet extends ElementsPalamodMod.ModElement {
	public ProcedureNightvisionhelmet(ElementsPalamodMod instance) {
		super(instance, 104);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Nightvisionhelmet!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 900, (int) 2, (false), (false)));
	}
}
