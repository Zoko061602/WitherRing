package com.Zoko061602.WitherRing;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

@Mod(modid="zwitherring",name="WitherRing",version="e^πi",dependencies="after:Baubles")
public class WitherRing {
	static Item Ring;
	
    @EventHandler
	public static void PreInit(FMLPreInitializationEvent e){
    	Ring = new ItemWitherRing();
		if(Loader.isModLoaded("Baubles"))
	    Ring = new BaubleWitherRing();

		 GameRegistry.registerItem(Ring,"ItemWitherRing","zwitherring");		
	}
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	CraftingManager.getInstance().addRecipe(new ItemStack(Ring),new Object[] {"BIB", "ISI", "BIB",'S',Items.nether_star,'I',Items.iron_ingot,'B',Items.milk_bucket});
                
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
                
    }

}
