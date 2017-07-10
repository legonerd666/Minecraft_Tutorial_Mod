package blocks;

import java.util.Random;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreRuby extends Block {

	public OreRuby() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TutorialBlocks.RUBYORE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.RUBYORE.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
		setHardness(3.0f);
		setResistance(12.0f);
		
	}
	
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		  return random.nextInt(5) + 1;
		 }

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		  int chance = rand.nextInt(2);
		  if(chance == 0){
		   return ModItems.ruby;
		  }
		  if(chance == 1){
		   return Items.DIAMOND;
		  }
		  
		  return ModItems.ruby;
		 }
	
}

