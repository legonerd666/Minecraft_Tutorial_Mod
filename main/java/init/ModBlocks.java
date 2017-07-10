package init;

import com.legonerd666.tutorial.Reference;

import blocks.BlockObsidian;
import blocks.BlockRuby;
import blocks.OreRuby;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class ModBlocks {
	
	public static Block rubyblock;
	public static Block rubyore;
	public static Block obsidianblock;

	public static void init() {
		
		rubyblock = new BlockRuby();
		rubyore = new OreRuby();
		obsidianblock = new BlockObsidian();
		
	}
	
	public static void register() {

		registerBlock(rubyblock);
		registerBlock(rubyore);
		registerBlock(obsidianblock);
		
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(rubyblock);
		GameRegistry.register(rubyore);
		GameRegistry.register(obsidianblock);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		
		registerRender(rubyblock);
		registerRender(rubyore);
		registerRender(obsidianblock);
		
	}
	
	private static void registerRender(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
}