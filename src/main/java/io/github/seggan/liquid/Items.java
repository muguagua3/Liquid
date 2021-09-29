package io.github.seggan.liquid;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    private Items() {}

    public static final ItemGroup CATEGORY = new ItemGroup(
        new NamespacedKey(Liquid.getInstance(), "liquids"),
        new CustomItemStack(Material.LAVA_BUCKET, "&6液体")
    );

    public static final SlimefunItemStack MELTER = new SlimefunItemStack(
        "MELTER",
        Material.BLAST_FURNACE,
        "&6高炉",
        "",
        "&7高温炉",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack SOLIDIFIER = new SlimefunItemStack(
        "SOLIDIFIER",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b金属固化器",
        "",
        "&7先进的冷凝器",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack TESTLCONTAINER = new SlimefunItemStack(
        "TESTLCONTAINER",
        Material.HAY_BLOCK,
        "&bTest LContainer",
        "",
        "&7Test Item(测试项目)"
    );

    public static final SlimefunItemStack TESTLCONTAINER_2 = new SlimefunItemStack(
        "TESTLCONTAINER_2",
        Material.HAY_BLOCK,
        "&bTest LContainer 2",
        "",
        "&7Test Item(测试项目)"
    );

    public static final SlimefunItemStack MIXER = new SlimefunItemStack(
        "MIXER",
        Material.BLAST_FURNACE,
        "&6金属液体搅拌机",
        "",
        "&7这台升级的熔化器",
        "&7非常适合混合液体",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack CENTRIFUGE = new SlimefunItemStack(
        "CENTRIFUGE",
        Material.HAY_BLOCK,
        "&6金属离心机",
        "",
        "&7金属离心机可以分离液体",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack CRYSTALLIZER = new SlimefunItemStack(
        "CRYSTALLIZER",
        Material.DIAMOND_BLOCK,
        "&b结晶器",
        "",
        "&7结晶器可以使特殊的晶体凝固",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack SPRAY_SOLIDIFIER = new SlimefunItemStack(
        "SPRAY_SOLIDIFIER",
        Material.SMITHING_TABLE,
        "&b金属喷雾固化器",
        "",
        "&7金属喷雾固化器可以将金属熔融喷为粉状",
        "&7这机器效率急块,但能源消耗也随之增加",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack SLAG = new SlimefunItemStack(
        "SLAG",
        Material.CHARCOAL,
        "&7熔渣",
        "",
        "&7你认为是垃圾",
        "&7他认为是珍宝"
    );
}
