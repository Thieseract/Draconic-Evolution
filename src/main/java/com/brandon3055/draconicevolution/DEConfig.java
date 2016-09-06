package com.brandon3055.draconicevolution;


import com.brandon3055.brandonscore.config.ModConfigProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brandon3055 on 24/3/2016.
 * This class holds all of the config values for Draconic Evolution
 */
public class DEConfig {

    public static Map<String, String> comments = new HashMap<String, String>();

    static
    {
        comments.put("items", "Allows you to disable any item in the mod. Note that disabling an item will automatically\ndisable its recipe and all recipes that use it. (Requires game restart)\nTo disable an item set its value to false");
        comments.put("blocks", "Allows you to disable any block in the mod. Note that disabling an block will automatically\ndisable its recipe and all recipes that use it. (Requires game restart)\nTo disable a block set its value to false");
        comments.put("World", "This category contains config properties related to world gen.");
        comments.put("Tweaks", "Just what the name says. Tweaks. Allows you to tweak stuff.");
        comments.put("Client Settings", "These are client side properties that have no effect server side.");
        comments.put("Stat Tweaks", "These allow you to tweak the stats of the tools, weapons and armor.");
    }

    //Category World

    @ModConfigProperty(category = "World", name = "worldGenEnabled", comment = "Setting this to false will just completely disable ALL DE world gen!")
    public static boolean worldGenEnabled = true;

    @ModConfigProperty(category = "World", name = "enableRetroGen", comment = "Set this to false if you do not want ore added to chunks that have not previously been generated by DE (this can almost always be left true)")
    public static boolean enableRetroGen = true;

    @ModConfigProperty(category = "World", name = "disableOreSpawnOverworld", comment = "Disables draconium ore generation in the overworld")
    public static boolean disableOreSpawnOverworld = false;

    @ModConfigProperty(category = "World", name = "disableOreSpawnEnd", comment = "Disables draconium ore generation in the end")
    public static boolean disableOreSpawnEnd = false;

    @ModConfigProperty(category = "World", name = "disableOreSpawnNether", comment = "Disables draconium ore generation in the nether")
    public static boolean disableOreSpawnNether = false;

    @ModConfigProperty(category = "World", name = "generateEnderComets", comment = "Set to false to disable the generation of Ender Comets")
    public static boolean generateEnderComets = true;

    @ModConfigProperty(category = "World", name = "generateChaosIslands", comment = "Set to false to disable the generation of Chaos Islands")
    public static boolean generateChaosIslands = true;

    @ModConfigProperty(category = "World", name = "cometRarity", comment = "Ender Comets have a 1 in {this number} chance to spawn in each chunk")
    public static int cometRarity = 10000;

    @ModConfigProperty(category = "World", name = "chaosIslandSeparation", comment = "This is the distance between chaos islands")
    public static int chaosIslandSeparation = 10000;

    @ModConfigProperty(category = "World", name = "oreGenDimentionBlacklist", comment = "Add the dimension id of any mod dimension's you dont want draconium ore generated in")
    public static int[] oreGenDimentionBlacklist = new int[0];

    //Category Tweak

    @ModConfigProperty(category = "Tweaks", name = "rapidDespawnAOEMinedItems", comment = "If set to true items dropped by tools in AOE mode will despawn after 5 seconds if not picked up.")
    public static boolean rapidDespawnAOEMinedItems = false;

    @ModConfigProperty(category = "Tweaks", name = "disableGuardianCrystalRespawn", comment = "(Wuss mode) Setting this to true will disable the chaos guardians ability to respawn healing crystals.")
    public static boolean disableGuardianCrystalRespawn = false;

    @ModConfigProperty(category = "Tweaks", name = "enableFlight", comment = "Set this to false if you would like to disable the draconic armors flight.")
    public static boolean enableFlight = true;

    @ModConfigProperty(category = "Tweaks", name = "dislocatorUsesPerPearl", comment = "Sets the number of teleports you get per ender pearl with the Advanced Dislocator")
    public static int dislocatorUsesPerPearl = 1;

    @ModConfigProperty(category = "Tweaks", name = "hardMode", comment = "When true everything is just a little harder. (Currently only effects recipes but that will probably change in the future)")
    public static boolean hardMode = false;

    @ModConfigProperty(category = "Tweaks", name = "bowBlockDamage", comment = "Set to false to prevent the bows explosion effect breaking blocks")
    public static boolean bowBlockDamage = true;

    @ModConfigProperty(category = "Tweaks", name = "grinderEnergyPerHeart", comment = "Sets the energy per use per heart of damage for the grinder.")
    public static int grinderEnergyPerHeart = 80;

    //public static boolean modifyVanillaResurrection = false; TODO

    //Category Client

    @ModConfigProperty(category = "Client Settings", name = "hudSettings", comment = "This is where the settings for the in game hud are stores. You should not need to adjust these unless something breaks.")
    public static int[] hudSettings = new int[]{996, 825, 69, 907, 90, 100, 3, 0, 1, 1, 1, 1}; //x, y, x, y, scale, scale, fademode, fademode, rotateArmor, armorText, hudEnabled, shieldEnabled

    @ModConfigProperty(category = "Client Settings", name = "disable3DModels", comment = "Disabled the 3D tool and armor models. This is required if you want to use a 2D resource pack.)")
    public static boolean disable3DModels = false;
}


//todo energy core storage values and ability to disable tier 8
//todo tool and armor stats and energy
//todo
//todo
