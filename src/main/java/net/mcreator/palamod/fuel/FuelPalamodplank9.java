
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockErablestairs;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank9 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank9(ElementsPalamodMod instance) {
		super(instance, 98);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockErablestairs.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
