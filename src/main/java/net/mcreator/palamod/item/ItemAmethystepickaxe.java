
package net.mcreator.palamod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.palamod.creativetab.TabPalamod;
import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Set;
import java.util.HashMap;

@ElementsPalamodMod.ModElement.Tag
public class ItemAmethystepickaxe extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:amethystepickaxe")
	public static final Item block = null;
	public ItemAmethystepickaxe(ElementsPalamodMod instance) {
		super(instance, 127);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("AMETHYSTEPICKAXE", 4, 1999, 12f, 1f, 10)) {
			{
				this.attackSpeed = -2.5f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("amethystepickaxe").setRegistryName("amethystepickaxe").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("palamod_:amethystepickaxe", "inventory"));
	}
}
