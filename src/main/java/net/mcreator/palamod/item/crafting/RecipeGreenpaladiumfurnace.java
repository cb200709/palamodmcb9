
package net.mcreator.palamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.item.ItemGreenpaladiumingot;
import net.mcreator.palamod.block.BlockPaladiumgreenore;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class RecipeGreenpaladiumfurnace extends ElementsPalamodMod.ModElement {
	public RecipeGreenpaladiumfurnace(ElementsPalamodMod instance) {
		super(instance, 72);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPaladiumgreenore.block, (int) (1)), new ItemStack(ItemGreenpaladiumingot.block, (int) (1)), 1F);
	}
}
