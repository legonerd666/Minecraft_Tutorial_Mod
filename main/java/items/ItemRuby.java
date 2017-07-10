package items;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import net.minecraft.item.Item;

public class ItemRuby extends Item {

	public ItemRuby() {
		
		setUnlocalizedName(Reference.TutorialItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.RUBY.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
		
	}
	
}