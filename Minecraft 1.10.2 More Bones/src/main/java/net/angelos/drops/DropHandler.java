package net.angelos.drops;

import java.util.Random;

import net.angelos.morebones.MoreBones;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
  public static Random random;
  public static Random dropChance;
  public static int offset;
  public static int dropped;
  
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {	
		if (MoreBones.enableDrops == true) {   
			random = new Random();
			offset = random.nextInt(2) + 1; //DO NOT CHANGE THIS? (+1 means at least 1 item drops..)

			if (MoreBones.batsDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.batDropChance) {
					if (event.getEntityLiving() instanceof EntityBat) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.chickensDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.chickenDropChance) {
					if (event.getEntityLiving() instanceof EntityChicken) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.cowsDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.cowDropChance) {
					if(event.getEntityLiving() instanceof EntityCow) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.horsesDropBones == true) {
				dropChance = new Random();	
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.horseDropChance) {
					if(event.getEntityLiving() instanceof EntityHorse) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}     
				}
			}
    
			if (MoreBones.ocelotsDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.ocelotDropChance) {
					if(event.getEntityLiving() instanceof EntityOcelot) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.pigsDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.pigDropChance) {
					if(event.getEntityLiving() instanceof EntityPig) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.rabbitsDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.rabbitDropChance) {
					if(event.getEntityLiving() instanceof EntityRabbit) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.sheepDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.sheepDropChance) {
					if(event.getEntityLiving() instanceof EntitySheep) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.villagersDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.villagerDropChance) {
					if(event.getEntityLiving() instanceof EntityVillager) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
			
			if (MoreBones.wolvesDropBones == true) {
				dropChance = new Random();
				if ((dropped = dropChance.nextInt(100)) <= MoreBones.wolfDropChance) {
					if(event.getEntityLiving() instanceof EntityWolf) {
						event.getEntityLiving().entityDropItem(new ItemStack(Items.BONE), offset);
					}
				}
			}
		}
	}
}
