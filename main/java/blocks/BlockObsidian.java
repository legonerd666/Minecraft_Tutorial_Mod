package blocks;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockObsidian extends Block{
	
	public BlockObsidian() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.OBSIDIANBLOCK.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.OBSIDIANBLOCK.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
		setHardness(8.0f);
		setResistance(28.0f);
	}

}
