
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockJacarandaplanks;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank1 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank1(ElementsPalamodMod instance) {
		super(instance, 90);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockJacarandaplanks.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
