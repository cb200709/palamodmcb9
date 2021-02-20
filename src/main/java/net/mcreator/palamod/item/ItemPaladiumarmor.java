
package net.mcreator.palamod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.palamod.procedure.ProcedureStrenghtchestplate;
import net.mcreator.palamod.procedure.ProcedureSpeedboots;
import net.mcreator.palamod.procedure.ProcedureNightvisionhelmet;
import net.mcreator.palamod.procedure.ProcedureHasteleggins;
import net.mcreator.palamod.creativetab.TabPalamod;
import net.mcreator.palamod.ElementsPalamodMod;

import java.util.Map;
import java.util.HashMap;

@ElementsPalamodMod.ModElement.Tag
public class ItemPaladiumarmor extends ElementsPalamodMod.ModElement {
	@GameRegistry.ObjectHolder("palamod_:paladiumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("palamod_:paladiumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("palamod_:paladiumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("palamod_:paladiumarmorboots")
	public static final Item boots = null;
	public ItemPaladiumarmor(ElementsPalamodMod instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PALADIUMARMOR", "palamod_:paladium_", 200, new int[]{7, 6, 8, 7}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureNightvisionhelmet.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("paladiumarmorhelmet").setRegistryName("paladiumarmorhelmet").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureStrenghtchestplate.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("paladiumarmorbody").setRegistryName("paladiumarmorbody").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureHasteleggins.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("paladiumarmorlegs").setRegistryName("paladiumarmorlegs").setCreativeTab(TabPalamod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureSpeedboots.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("paladiumarmorboots").setRegistryName("paladiumarmorboots").setCreativeTab(TabPalamod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("palamod_:paladiumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("palamod_:paladiumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("palamod_:paladiumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("palamod_:paladiumarmorboots", "inventory"));
	}
}
