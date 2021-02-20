package net.mcreator.palamod.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureFakewaterMobplayerCollidesBlock extends ElementsPalamodMod.ModElement {
	public ProcedureFakewaterMobplayerCollidesBlock(ElementsPalamodMod instance) {
		super(instance, 161);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FakewaterMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.DROWN, (float) 1);
	}
}
