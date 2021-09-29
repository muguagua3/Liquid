package io.github.seggan.liquid.objects;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;

import lombok.Getter;

import javax.annotation.Nonnull;

public class Fluid extends SlimefunItem {

    
    private @Getter ItemStack recipeDisplayItem;
    private @Getter ItemStack bottleItem;
    private @Getter ItemStack bucketItem = this.getItem();
    private @Getter ItemStack nuggetItem;
    private @Getter ItemStack ingotItem;
    private @Getter ItemStack gemItem;
    private @Getter ItemStack blockItem;

    public Fluid(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        //Maybe figure out how make a fluid not spread and ret-con this for Primal Mana related shenanigans
        addItemHandler((ItemUseHandler) PlayerRightClickEvent::cancel); 
    }

    //I put this here to get around the stack limit of buckets and give people a better way to display a fluid
    //Ex. STAINED_GLASS_PANES 
    public Fluid setRecipeDisplayItem(@Nonnull ItemStack recipeDisplayItem) {
        Validate.notNull(recipeDisplayItem, "配方材料不能为空!");
        this.recipeDisplayItem = recipeDisplayItem;
        return this;
    }

    /*
    *   Overridable ItemStack setters to be helpful in the context of 
    *   melters and Fluid storage containers. The null returns are so they need to
    *   override to use it.
    */

    //Returns Fluid so that you can chain them together on register
    public Fluid setBottleItem(@Nonnull ItemStack bottleItem) {
        Validate.notNull(bottleItem, "容器不能为空!");
        this.bottleItem = bottleItem;
        return this;
    }

    public Fluid setBucketItem(@Nonnull ItemStack bucketItem) {
        Validate.notNull(bucketItem, "bucket不能为空!");
        this.bucketItem = bucketItem;
        return this;
    }

    public Fluid setNuggetItem(@Nonnull ItemStack nuggetItem) {
        Validate.notNull(nuggetItem, "nugget不能为空!");
        this.nuggetItem = nuggetItem;
        return this;
    }

    public Fluid setIngotItem(@Nonnull ItemStack ingotItem) {
        Validate.notNull(ingotItem, "锭不能为空");
        this.ingotItem = ingotItem;
        return this;
    }

    public Fluid setGemItem(@Nonnull ItemStack gemItem) {
        Validate.notNull(gemItem, "物品不能为空");
        this.gemItem = gemItem;
        return this;
    }

    public Fluid setBlockItem(@Nonnull ItemStack blockItem) {
        Validate.notNull(blockItem, "物品方块不能为空");
        this.blockItem = blockItem;
        return this;
    }

    // Static Fluid amount getters

    public static final int getBottleFluidAmount() {
        return 324;
    }

    public static final int getBucketFluidAmount() {
        return 1000;
    }

    public static final int getNuggetFluidAmount() {
        return 16;
    }

    public static final int getIngotFluidAmount() {
        return 144;
    }

    public static final int getGemFluidAmount() {
        return 144;
    }

    public static final int getBlockFluidAmount() {
        return 1296;
    }
}
