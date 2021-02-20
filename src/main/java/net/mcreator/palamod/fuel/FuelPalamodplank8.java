
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockErableslab;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank8 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank8(ElementsPalamodMod instance) {
		super(instance, 97);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockErableslab.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
