
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
public class ItemAmethystearmor extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:amethystearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("palamod_:amethystearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("palamod_:amethystearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("palamod_:amethystearmorboots")
	public static final Item boots = null;
	public ItemAmethystearmor(ElementsPalamodMod instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AMETHYSTEARMOR", "palamod_:amethyst_.png", 100, new int[]{5, 4, 6, 5}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("amethystearmorhelmet")
				.setRegistryName("amethystearmorhelmet").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("amethystearmorbody")
				.setRegistryName("amethystearmorbody").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("amethystearmorlegs")
				.setRegistryName("amethystearmorlegs").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("amethystearmorboots")
				.setRegistryName("amethystearmorboots").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("palamod_:amethystearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("palamod_:amethystearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("palamod_:amethystearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("palamod_:amethystearmorboots", "inventory"));
	}
}
