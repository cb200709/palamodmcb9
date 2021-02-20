
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockErableplanks;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank(ElementsPalamodMod instance) {
		super(instance, 89);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockErableplanks.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
