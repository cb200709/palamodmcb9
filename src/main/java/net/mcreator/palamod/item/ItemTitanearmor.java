
package net.mcreator.palamod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.palamod.creativetab.TabPalamod;
import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class ItemTitanearmor extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:titanearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("palamod_:titanearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("palamod_:titanearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("palamod_:titanearmorboots")
	public static final Item boots = null;
	public ItemTitanearmor(ElementsPalamodMod instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TITANEARMOR", "palamod_:titane_.png", 125, new int[]{6, 5, 7, 6}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titanearmorhelmet")
				.setRegistryName("titanearmorhelmet").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titanearmorbody")
				.setRegistryName("titanearmorbody").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titanearmorlegs")
				.setRegistryName("titanearmorlegs").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titanearmorboots")
				.setRegistryName("titanearmorboots").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("palamod_:titanearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("palamod_:titanearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("palamod_:titanearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("palamod_:titanearmorboots", "inventory"));
	}
}
