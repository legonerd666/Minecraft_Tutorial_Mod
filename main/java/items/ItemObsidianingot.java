package items;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import net.minecraft.item.Item;

public class ItemObsidianingot extends Item {

	public ItemObsidianingot() {
		
		setUnlocalizedName(Reference.TutorialItems.OBSIDIANINGOT.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.OBSIDIANINGOT.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
		
	}
	
}
