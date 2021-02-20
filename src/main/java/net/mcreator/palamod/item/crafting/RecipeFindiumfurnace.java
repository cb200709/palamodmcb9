
package net.mcreator.palamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.item.ItemFindium;
import net.mcreator.palamod.block.BlockFindiumore;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class RecipeFindiumfurnace extends ElementsPalamodMod.ModElement {
	public RecipeFindiumfurnace(ElementsPalamodMod instance) {
		super(instance, 84);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockFindiumore.block, (int) (1)), new ItemStack(ItemFindium.block, (int) (1)), 1F);
	}
}
