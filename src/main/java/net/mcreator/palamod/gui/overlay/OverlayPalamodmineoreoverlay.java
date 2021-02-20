
package net.mcreator.palamod.gui.overlay;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.palamod.ElementsPalamodMod;

@ElementsPalamodMod.ModElement.Tag
public class OverlayPalamodmineoreoverlay extends ElementsPalamodMod.ModElement {
	public OverlayPalamodmineoreoverlay(ElementsPalamodMod instance) {
		super(instance, 101);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
	}
	public static class GUIRenderEventClass {
		@SubscribeEvent(priority = EventPriority.NORMAL)
		@SideOnly(Side.CLIENT)
		public void eventHandler(RenderGameOverlayEvent event) {
			if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
				int posX = (event.getResolution().getScaledWidth()) / 2;
				int posY = (event.getResolution().getScaledHeight()) / 2;
				EntityPlayer entity = Minecraft.getMinecraft().player;
				World world = entity.world;
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				if (true) {
					Minecraft.getMinecraft().fontRenderer.drawString("paladium: 0-15", posX + -213, posY + 104, -65536);
					Minecraft.getMinecraft().fontRenderer.drawString("titane : 0-50", posX + -214, posY + 90, -6710887);
					Minecraft.getMinecraft().fontRenderer.drawString("findium : 0-156", posX + -213, posY + 97, -256);
					Minecraft.getMinecraft().fontRenderer.drawString("green paladium: all", posX + -212, posY + 110, -13369600);
					Minecraft.getMinecraft().fontRenderer.drawString("am\u00E9thyste : 0-80", posX + -213, posY + 84, -6750004);
					Minecraft.getMinecraft().fontRenderer.drawString("couche de minerais", posX + -214, posY + 76, -12829636);
				}
			}
		}
	}
}
