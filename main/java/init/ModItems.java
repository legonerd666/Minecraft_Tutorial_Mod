package init;

import com.legonerd666.tutorial.Reference;

//import items.ItemObsidianchestplate;
import items.ItemObsidianingot;
import items.ItemRuby;
import items.ItemTomato;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item obsidianingot;
	public static Item ruby;
	public static Item tomato;
	//public static Item obsidianchestplate;

	public static void init() {
		
		obsidianingot = new ItemObsidianingot();
		ruby = new ItemRuby();
		tomato = new ItemTomato();
		//obsidianchestplate = new ItemObsidianchestplate();
		
	}
	
	public static void register() {
		
		GameRegistry.register(obsidianingot);
		GameRegistry.register(ruby);
		GameRegistry.register(tomato);
		//GameRegistry.register(obsidianchestplate);
		
	}
	
	public static void registerRenders() {
		
		registerRender(obsidianingot);
		registerRender(ruby);
		registerRender(tomato);
		//registerRender(obsidianchestplate);
		
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
