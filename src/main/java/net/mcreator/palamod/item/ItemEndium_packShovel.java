
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
public class ItemEndium_packShovel extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:endium_pack_shovel")
	public static final Item block = null;
	public ItemEndium_packShovel(ElementsPalamodMod instance) {
		super(instance, 146);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ENDIUM_PACK_SHOVEL", 3, 525, 8f, -1f, 24)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("endium_pack_shovel").setRegistryName("endium_pack_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("palamod_:endium_pack_shovel", "inventory"));
	}
}
