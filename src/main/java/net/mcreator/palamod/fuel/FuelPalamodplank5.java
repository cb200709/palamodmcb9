
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJacarandastairs;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank5 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank5(ElementsPalamodMod instance) {
		super(instance, 94);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJacarandastairs.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
