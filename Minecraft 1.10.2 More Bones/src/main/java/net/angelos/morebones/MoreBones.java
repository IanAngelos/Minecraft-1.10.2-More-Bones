package net.angelos.morebones;

import net.angelos.drops.DropHandler;
import net.angelos.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreBones.modId, name = MoreBones.name, version = MoreBones.version, acceptedMinecraftVersions = "[1.10.2]")

public class MoreBones {
	@SidedProxy(serverSide = "net.angelos.proxy.CommonProxy", clientSide = "net.angelos.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "MoreBones";
	public static final String name = "More Bones";
	public static final String version = "1.0.0";
	
	//General Config Vars
	public static boolean enableDrops;
	
	//Drop Enable Config Vars
	public static boolean batsDropBones;
	public static boolean chickensDropBones;
	public static boolean cowsDropBones;
	public static boolean horsesDropBones;
	public static boolean ocelotsDropBones;
	public static boolean pigsDropBones;
	public static boolean rabbitsDropBones;
	public static boolean sheepDropBones;
	public static boolean villagersDropBones;
	public static boolean wolvesDropBones;
	
	//Drop Chance Config Vars
	public static int batDropChance;
	public static int chickenDropChance;
	public static int cowDropChance;
	public static int horseDropChance;
	public static int ocelotDropChance;
	public static int pigDropChance;
	public static int rabbitDropChance;
	public static int sheepDropChance;
	public static int villagerDropChance;
	public static int wolfDropChance;
	
	@Mod.Instance(modId)
	public static MoreBones instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//General Config
		enableDrops = config.get("A:GENERAL CONFIG", "Enable all drop table changes?", true).getBoolean();
		
		//Drop Enable Config
		batsDropBones = config.get("B:ENABLE DROPS", "Bats Drop Bones?", true).getBoolean();
		chickensDropBones = config.get("B:ENABLE DROPS", "Chickens Drop Bones?", true).getBoolean();
		cowsDropBones = config.get("B:ENABLE DROPS", "Cows Drop Bones?", true).getBoolean();
		horsesDropBones = config.get("B:ENABLE DROPS", "Horses Drop Bones?", true).getBoolean();
		ocelotsDropBones = config.get("B:ENABLE DROPS", "Ocelots Drop Bones?", true).getBoolean();
		pigsDropBones = config.get("B:ENABLE DROPS", "Pigs Drop Bones?", true).getBoolean();
		rabbitsDropBones = config.get("B:ENABLE DROPS", "Rabbits Drop Bones?", true).getBoolean();
		sheepDropBones = config.get("B:ENABLE DROPS", "Sheep Drop Bones?", true).getBoolean();
		villagersDropBones = config.get("B:ENABLE DROPS", "Villagers Drop Bones?", true).getBoolean();
		wolvesDropBones = config.get("B:ENABLE DROPS", "Wolves Drop Bones?", true).getBoolean();
		
		//Drop Chance Config
		batDropChance = config.get("C:DROP CHANCES", "Bats Bone Drop Chance?", 5).getInt();
		chickenDropChance = config.get("C:DROP CHANCES", "Chickens Bone Drop Chance?", 5).getInt();
		cowDropChance = config.get("C:DROP CHANCES", "Cows Bone Drop Chance?", 50).getInt();
		horseDropChance = config.get("C:DROP CHANCES", "Horses Bone Drop Chance?", 90).getInt();
		ocelotDropChance = config.get("C:DROP CHANCES", "Ocelots Bone Drop Chance?", 10).getInt();
		pigDropChance = config.get("C:DROP CHANCES", "Pigs Bone Drop Chance?", 20).getInt();
		rabbitDropChance = config.get("C:DROP CHANCES", "Rabbits Bone Drop Chance?", 5).getInt();
		sheepDropChance = config.get("C:DROP CHANCES", "Sheep Bone Drop Chance?", 20).getInt();
		villagerDropChance = config.get("C:DROP CHANCES", "Villagers Bone Drop Chance?", 50).getInt();
		wolfDropChance = config.get("C:DROP CHANCES", "Wolves Bone Drop Chance?", 20).getInt();
		config.save();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
