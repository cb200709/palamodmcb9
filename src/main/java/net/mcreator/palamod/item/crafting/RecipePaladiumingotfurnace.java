
package net.mcreator.palamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.item.ItemPaladiumingot;
import net.mcreator.palamod.block.BlockPaladiumore;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class RecipePaladiumingotfurnace extends ElementsPalamodMod.ModElement {
	public RecipePaladiumingotfurnace(ElementsPalamodMod instance) {
		super(instance, 29);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPaladiumore.block, (int) (1)), new ItemStack(ItemPaladiumingot.block, (int) (1)), 1F);
	}
}
