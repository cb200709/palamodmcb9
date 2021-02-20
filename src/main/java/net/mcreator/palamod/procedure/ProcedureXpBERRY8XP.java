package net.mcreator.palamod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Random;
import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureXpBERRY8XP extends ElementsPalamodMod.ModElement {
	public ProcedureXpBERRY8XP(ElementsPalamodMod instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XpBERRY8XP!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure XpBERRY8XP!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 10, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 8);
	}
}
