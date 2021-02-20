
package net.mcreator.palamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.item.ItemTitaneingot;
import net.mcreator.palamod.block.BlockTitaneore;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class RecipeTitaneingotfurnace extends ElementsPalamodMod.ModElement {
	public RecipeTitaneingotfurnace(ElementsPalamodMod instance) {
		super(instance, 45);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaneore.block, (int) (1)), new ItemStack(ItemTitaneingot.block, (int) (1)), 1F);
	}
}
