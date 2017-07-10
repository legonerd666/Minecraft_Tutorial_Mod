package items;

import com.legonerd666.tutorial.Reference;
import com.legonerd666.tutorial.Tutorial;

import net.minecraft.item.ItemFood;

public class ItemTomato extends ItemFood {

	public ItemTomato() {
		super(6, 0.5F, false);
		setUnlocalizedName(Reference.TutorialItems.TOMATO.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.TOMATO.getRegistryName());
		setCreativeTab(Tutorial.tabTutorial);
	}

}
