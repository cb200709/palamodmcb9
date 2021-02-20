
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockOstryastairs;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank11 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank11(ElementsPalamodMod instance) {
		super(instance, 100);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockOstryastairs.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
