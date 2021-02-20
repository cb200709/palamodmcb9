
package net.mcreator.palamod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.palamod.block.BlockOstryaplanks;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class FuelPalamodplank3 extends ElementsPalamodMod.ModElement {
	public FuelPalamodplank3(ElementsPalamodMod instance) {
		super(instance, 92);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockOstryaplanks.block, (int) (1)).getItem())
			return 300;
		return 0;
	}
}
