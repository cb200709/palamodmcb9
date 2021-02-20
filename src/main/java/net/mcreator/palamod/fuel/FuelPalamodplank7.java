
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJudeecercisstairs;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank7 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank7(ElementsPalamodMod instance) {
		super(instance, 96);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJudeecercisstairs.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
