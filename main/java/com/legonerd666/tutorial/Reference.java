package com.legonerd666.tutorial;

public class Reference {
	
	public static final String MOD_ID = "ltm";
	public static final String NAME = "Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.legonerd666.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.legonerd666.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		
		OBSIDIANINGOT("obsidianingot", "ItemObsidianingot"),
		OBSIDIANBLOCK("obsidianblock", "ItemObsidianblock"),
		RUBY("ruby", "ItemRuby"),
		TOMATO("tomato", "ItemTomato");
		//OBSIDIANCHESTPLATE("obsidianchestplate", "ItemObsidianchestplate");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
public static enum TutorialBlocks {
	
		RUBYBLOCK("rubyblock", "BlockRuby"),
		RUBYORE("rubyore", "OreRuby"),
	    OBSIDIANBLOCK("obsidianblock", "BlockObsidian");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
}
