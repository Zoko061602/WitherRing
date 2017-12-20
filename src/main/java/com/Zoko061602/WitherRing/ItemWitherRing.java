package com.Zoko061602.WitherRing;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemWitherRing extends Item {
	
	public ItemWitherRing() {
	 this.setTextureName("zwitherring:ItemWitherRing");
	 this.setCreativeTab(CreativeTabs.tabTools);
	 this.setUnlocalizedName("ItemWitherRing");

	}

	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity arg1, int p_77663_4_,boolean p_77663_5_) {
		if(arg1 instanceof EntityLivingBase)
		if(((EntityLivingBase) arg1).isPotionActive(Potion.wither))
			((EntityLivingBase) arg1).removePotionEffect(Potion.wither.id);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_){
        return true;
    }
}
