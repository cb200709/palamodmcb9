
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJudeecercisplanks;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank2 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank2(ElementsPalamodMod instance) {
		super(instance, 91);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJudeecercisplanks.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
