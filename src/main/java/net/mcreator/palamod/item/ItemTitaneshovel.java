
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Set;
import java.util.HashMap;

@ElementsPalamodMod.ModElement.Tag
public class ItemTitaneshovel extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:titaneshovel")
	public static final Item block = null;
	public ItemTitaneshovel(ElementsPalamodMod instance) {
		super(instance, 175);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("TITANESHOVEL", 5, 2999, 14f, 0.5f, 10)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("titaneshovel").setRegistryName("titaneshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("palamod_:titaneshovel", "inventory"));
	}
}
