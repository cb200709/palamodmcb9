
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJudeecercisslab;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank6 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank6(ElementsPalamodMod instance) {
		super(instance, 95);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJudeecercisslab.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
