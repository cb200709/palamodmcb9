
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockOstryaslab;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank10 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank10(ElementsPalamodMod instance) {
		super(instance, 99);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockOstryaslab.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
