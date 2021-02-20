package net.mcreator.palamod.procedure;

import net.minecraft.world.GameType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;
import java.util.Collection;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureCaveblockspecon extends ElementsPalamodMod.ModElement {
	public ProcedureCaveblockspecon(ElementsPalamodMod instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Caveblockspecon!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 60, (int) 1, (false), (false)));
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.SPEED)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.NOT_SET);
		}
	}
}
