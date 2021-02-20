
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJacarandaslab;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank4 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank4(ElementsPalamodMod instance) {
		super(instance, 93);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJacarandaslab.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
