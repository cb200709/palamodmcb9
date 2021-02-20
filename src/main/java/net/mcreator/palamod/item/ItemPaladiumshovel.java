
package net.mcreator.palamod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.palamod.creativetab.TabPalamod;
import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Set;
import java.util.HashMap;

@ElementsPalamodMod.ModElement.Tag
public class ItemPaladiumshovel extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:paladiumshovel")
	public static final Item block = null;
	public ItemPaladiumshovel(ElementsPalamodMod instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("PALADIUMSHOVEL", 6, 4999, 13f, 2.5f, 15)) {
			{
				this.attackSpeed = -3.5f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 6);
				return ret.keySet();
			}
		}.setUnlocalizedName("paladiumshovel").setRegistryName("paladiumshovel").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("palamod_:paladiumshovel", "inventory"));
	}
}
