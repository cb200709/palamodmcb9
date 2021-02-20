package net.mcreator.palamod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.palamod.item.ItemXpfruit;
import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;

@ElementsPalamodMod.ModElement.Tag
public class ProcedureXpberryitemscreative extends ElementsPalamodMod.ModElement {
	public ProcedureXpberryitemscreative(ElementsPalamodMod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Xpberryitemscreative!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemXpfruit.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
