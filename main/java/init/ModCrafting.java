package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyblock), "RRR", "RRR", "RRR", 'R', ModItems.ruby);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.obsidianblock), "OOO", "OOO", "OOO", 'O', ModItems.obsidianingot);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.PURPLE_SHULKER_BOX), "RRR", "RCR", "RRR", 'R', ModBlocks.rubyblock, 'C', Blocks.CHEST);
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianchestplate), "O O", "OOO", "OOO", 'O', ModItems.obsidianingot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby), Items.EMERALD, Items.REDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9), ModBlocks.rubyblock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianingot, 9), ModBlocks.obsidianblock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomato), Blocks.VINE, Items.APPLE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomato), Blocks.GRASS, Items.APPLE);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WHITE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ORANGE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MAGENTA_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIGHT_BLUE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.YELLOW_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIME_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PINK_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAY_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SILVER_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CYAN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BLUE_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BROWN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GREEN_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BLACK_SHULKER_BOX), Blocks.PURPLE_SHULKER_BOX, new ItemStack(Items.DYE, 1, 0));
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidianingot), 100f);
	}
	
}
