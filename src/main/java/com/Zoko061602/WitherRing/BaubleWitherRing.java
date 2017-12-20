package com.Zoko061602.WitherRing;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class BaubleWitherRing extends Item implements IBauble {
	
	public BaubleWitherRing() {
	 this.setTextureName("zwitherring:ItemWitherRing");
	 this.setCreativeTab(CreativeTabs.tabTools);
	 this.setUnlocalizedName("ItemWitherRing");
	}

	@Override
	public boolean canEquip(ItemStack arg0, EntityLivingBase arg1) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack arg0, EntityLivingBase arg1) {
		return true;
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.RING;
	}

	@Override
	public void onEquipped(ItemStack arg0, EntityLivingBase arg1) {		
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase arg1) {
	}

	@Override
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1) {
		if(arg1.isPotionActive(Potion.wither))
			arg1.removePotionEffect(Potion.wither.id);
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
