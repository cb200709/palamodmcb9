
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
public class ItemEndium_packArmor extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:endium_pack_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("palamod_:endium_pack_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("palamod_:endium_pack_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("palamod_:endium_pack_armorboots")
	public static final Item boots = null;
	public ItemEndium_packArmor(ElementsPalamodMod instance) {
		super(instance, 153);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ENDIUM_PACK_ARMOR", "palamod_:endium_", 310, new int[]{10, 9, 9, 10}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("endium_pack_armorhelmet")
				.setRegistryName("endium_pack_armorhelmet").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("endium_pack_armorbody")
				.setRegistryName("endium_pack_armorbody").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("endium_pack_armorlegs")
				.setRegistryName("endium_pack_armorlegs").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("endium_pack_armorboots")
				.setRegistryName("endium_pack_armorboots").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("palamod_:endium_pack_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("palamod_:endium_pack_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("palamod_:endium_pack_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("palamod_:endium_pack_armorboots", "inventory"));
	}
}
