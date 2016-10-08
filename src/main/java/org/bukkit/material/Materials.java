package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.util.matcher.Matcher;
import org.bukkit.util.matcher.MatcherOr;

/**
 * Default Materials(Data) matchers
 */
public enum Materials implements Matcher<Material> {

    // Stairs
    BRICK_STAIRS(Material.BRICK_STAIRS, Material.NETHER_BRICK_STAIRS),
    WOODEN_STAIRS(Material.ACACIA_STAIRS, Material.BIRCH_WOOD_STAIRS, Material.DARK_OAK_STAIRS, Material.JUNGLE_WOOD_STAIRS, Material.SPRUCE_WOOD_STAIRS, Material.WOOD_STAIRS),
    STAIRS(WOODEN_STAIRS, BRICK_STAIRS, Material.COBBLESTONE_STAIRS, Material.COBBLESTONE_STAIRS, Material.SMOOTH_STAIRS, Material.QUARTZ_STAIRS, Material.SANDSTONE_STAIRS),

    //Doors
    WOODEN_DOORS(Material.WOODEN_DOOR, Material.WOOD_DOOR),
    IRON_DOORS(Material.IRON_DOOR, Material.IRON_DOOR_BLOCK),
    DOORS(WOODEN_DOORS, IRON_DOORS),

    //Trapdoors
    WOODEN_TRAPDOORS(Material.TRAP_DOOR),
    TRAPDOORS(WOODEN_TRAPDOORS),

    //Tools
    PICKAXES(Material.WOOD_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLD_PICKAXE, Material.DIAMOND_PICKAXE),
    SPADES(Material.WOOD_SPADE, Material.STONE_SPADE, Material.IRON_SPADE, Material.GOLD_SPADE, Material.DIAMOND_SPADE),
    AXES(Material.WOOD_AXE, Material.STONE_AXE, Material.IRON_AXE, Material.GOLD_AXE, Material.DIAMOND_AXE),
    HOES(Material.WOOD_HOE, Material.STONE_HOE, Material.IRON_HOE, Material.GOLD_HOE, Material.DIAMOND_HOE),
    TOOLS(PICKAXES, SPADES, AXES, HOES),

    BLOCKS(new BlockMatcher()),

    //Liquids and Buckets
    WATER_LIQUIDS(Material.WATER, Material.STATIONARY_WATER),
    LAVA_LIQUIDS(Material.LAVA, Material.STATIONARY_LAVA),
    LIQUIDS(WATER_LIQUIDS, LAVA_LIQUIDS),
    FILLED_BUCKETS(Material.LAVA_BUCKET, Material.MILK_BUCKET, Material.WATER_BUCKET),
    BUCKETS(Material.BUCKET, FILLED_BUCKETS),

    //Fishes
    //see below
    FISHES(Material.COOKED_FISH, Material.RAW_FISH);


    //Fishes
    public static final Matcher<MaterialData> NORMAL_RAW_FISH = new MaterialData(Material.RAW_FISH, (byte) 0);
    public static final Matcher<MaterialData> RAW_SALMON = new MaterialData(Material.RAW_FISH, (byte) 1);
    public static final Matcher<MaterialData> PUFFER_FISH = new MaterialData(Material.RAW_FISH, (byte) 2);
    public static final Matcher<MaterialData> CLOWN_FISH = new MaterialData(Material.RAW_FISH, (byte) 3);

    public static final Matcher<MaterialData> NORMAL_COOKED_FISH = new MaterialData(Material.COOKED_FISH, (byte) 0);
    public static final Matcher<MaterialData> COOKED_SALMON = new MaterialData(Material.COOKED_FISH, (byte) 1);

    //Woods
    public static final Matcher<MaterialData> OAK_WOOD = new MaterialData(Material.WOOD, (byte) 0);
    public static final Matcher<MaterialData> SPRUCE_WOOD = new MaterialData(Material.WOOD, (byte) 1);
    public static final Matcher<MaterialData> BIRCH_WOOD = new MaterialData(Material.WOOD, (byte) 2);
    public static final Matcher<MaterialData> JUNGLE_WOOD = new MaterialData(Material.WOOD, (byte) 3);
    public static final Matcher<MaterialData> ACACIA_WOOD = new MaterialData(Material.WOOD, (byte) 4);
    public static final Matcher<MaterialData> DARK_OAK_WOOD = new MaterialData(Material.WOOD, (byte) 5);

    /////////////////////////////////////////////////////////////
    //Implementation
    private Matcher<Material> internMatcher;

    Materials(Matcher<Material>... or) {
        this(new MatcherOr<Material>(or));
    }

    Materials(Matcher<Material> exact) {
        internMatcher = exact;
    }

    @Override
    public boolean matches(Material object) {
        return internMatcher.matches(object);
    }

    private static class BlockMatcher implements Matcher<Material> {
        @Override
        public boolean matches(Material object) {
            return object.isBlock();
        }
    }
}
