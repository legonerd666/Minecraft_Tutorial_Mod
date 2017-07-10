package blocks;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.RUBYBLOCK.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
		setHardness(6.0f);
		setResistance(18.0f);
	}

}
