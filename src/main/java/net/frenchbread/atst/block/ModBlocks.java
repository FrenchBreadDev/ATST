package net.frenchbread.atst.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbread.atst.ATSTMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

    public class ModBlocks {

       // public static final Block ECCENTRIUM_ORE = registerBlock("eccentrium_ore",
               // new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                       // UniformIntProvider.create(3, 7)));

       //public static final Block ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
               // new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                      //  UniformIntProvider.create(3, 7)));


        /* public static final Block CRYSTAL_SHULKER = registerBlock("crystal_shulker",
           new ShulkerBoxBlock(DyeColor.MAGENTA,
                   FabricBlockSettings.copy(Blocks.MAGENTA_SHULKER_BOX).strength(6.0f)));
*/
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ATSTMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ATSTMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(ATSTMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().fireproof()));
    }

    public static void registerModBlocks() {
        ATSTMod.LOGGER.debug("Registering ModBlocks for " + ATSTMod.MOD_ID);
    }
}

