
package net.mcreator.palamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.item.ItemAmethysteingot;
import net.mcreator.palamod.block.BlockAmethysteore;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class RecipeAmethysteingotfurnace extends ElementsPalamodMod.ModElement {
	public RecipeAmethysteingotfurnace(ElementsPalamodMod instance) {
		super(instance, 36);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAmethysteore.block, (int) (1)), new ItemStack(ItemAmethysteingot.block, (int) (1)), 1F);
	}
}
