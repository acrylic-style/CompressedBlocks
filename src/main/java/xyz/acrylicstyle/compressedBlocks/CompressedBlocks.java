package xyz.acrylicstyle.compressedBlocks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.acrylicstyle.paper.Paper;
import xyz.acrylicstyle.paper.inventory.ItemStackUtils;
import xyz.acrylicstyle.paper.nbt.NBTTagCompound;
import xyz.acrylicstyle.tomeito_api.gui.ClickableItem;

import java.util.ArrayList;
import java.util.Objects;

import static org.bukkit.Bukkit.addRecipe;
import static org.bukkit.Bukkit.removeRecipe;

public class CompressedBlocks extends JavaPlugin implements Listener {
    public static CompressedBlocks instance = null;

    public static NamespacedKey compressed_redstone_block = null;
    public static NamespacedKey compressed_lapis_block = null;
    public static NamespacedKey compressed_iron_block = null;
    public static NamespacedKey compressed_coal_block = null;
    public static NamespacedKey compressed_gold_block = null;
    public static NamespacedKey compressed_diamond_block = null;
    public static NamespacedKey compressed_emerald_block = null;

    public static NamespacedKey compressed_sand_1 = null;
    public static NamespacedKey compressed_sand_2 = null;
    public static NamespacedKey compressed_sand_3 = null;
    public static NamespacedKey compressed_sand_4 = null;
    public static NamespacedKey compressed_sand_5 = null;
    public static NamespacedKey compressed_sand_6 = null;
    public static NamespacedKey compressed_sand_7 = null;
    public static NamespacedKey compressed_sand_8 = null;

    public static NamespacedKey uncompressed_sand_1 = null;
    public static NamespacedKey uncompressed_sand_2 = null;
    public static NamespacedKey uncompressed_sand_3 = null;
    public static NamespacedKey uncompressed_sand_4 = null;
    public static NamespacedKey uncompressed_sand_5 = null;
    public static NamespacedKey uncompressed_sand_6 = null;
    public static NamespacedKey uncompressed_sand_7 = null;
    public static NamespacedKey uncompressed_sand_8 = null;

    public static NamespacedKey uncompressed_redstone_block = null;
    public static NamespacedKey uncompressed_lapis_block = null;
    public static NamespacedKey uncompressed_iron_block = null;
    public static NamespacedKey uncompressed_coal_block = null;
    public static NamespacedKey uncompressed_gold_block = null;
    public static NamespacedKey uncompressed_diamond_block = null;
    public static NamespacedKey uncompressed_emerald_block = null;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        compressed_redstone_block = new NamespacedKey(this, "compressed_redstone_block");
        compressed_lapis_block = new NamespacedKey(this, "compressed_lapis_block");
        compressed_iron_block = new NamespacedKey(this, "compressed_iron_block");
        compressed_coal_block = new NamespacedKey(this, "compressed_coal_block");
        compressed_gold_block = new NamespacedKey(this, "compressed_gold_block");
        compressed_diamond_block = new NamespacedKey(this, "compressed_diamond_block");
        compressed_emerald_block = new NamespacedKey(this, "compressed_emerald_block");
        uncompressed_redstone_block = new NamespacedKey(this, "uncompressed_redstone_block");
        uncompressed_lapis_block = new NamespacedKey(this, "uncompressed_lapis_block");
        uncompressed_iron_block = new NamespacedKey(this, "uncompressed_iron_block");
        uncompressed_coal_block = new NamespacedKey(this, "uncompressed_coal_block");
        uncompressed_gold_block = new NamespacedKey(this, "uncompressed_gold_block");
        uncompressed_diamond_block = new NamespacedKey(this, "uncompressed_diamond_block");
        uncompressed_emerald_block = new NamespacedKey(this, "uncompressed_emerald_block");
        compressed_sand_1 = new NamespacedKey(this, "compressed_sand_1");
        compressed_sand_2 = new NamespacedKey(this, "compressed_sand_2");
        compressed_sand_3 = new NamespacedKey(this, "compressed_sand_3");
        compressed_sand_4 = new NamespacedKey(this, "compressed_sand_4");
        compressed_sand_5 = new NamespacedKey(this, "compressed_sand_5");
        compressed_sand_6 = new NamespacedKey(this, "compressed_sand_6");
        compressed_sand_7 = new NamespacedKey(this, "compressed_sand_7");
        compressed_sand_8 = new NamespacedKey(this, "compressed_sand_8");
        uncompressed_sand_1 = new NamespacedKey(this, "uncompressed_sand_1");
        uncompressed_sand_2 = new NamespacedKey(this, "uncompressed_sand_2");
        uncompressed_sand_3 = new NamespacedKey(this, "uncompressed_sand_3");
        uncompressed_sand_4 = new NamespacedKey(this, "uncompressed_sand_4");
        uncompressed_sand_5 = new NamespacedKey(this, "uncompressed_sand_5");
        uncompressed_sand_6 = new NamespacedKey(this, "uncompressed_sand_6");
        uncompressed_sand_7 = new NamespacedKey(this, "uncompressed_sand_7");
        uncompressed_sand_8 = new NamespacedKey(this, "uncompressed_sand_8");
        ItemStack ri = getItemStack(Material.REDSTONE_BLOCK, "圧縮されたレッドストーンブロック");
        ShapedRecipe rr = new ShapedRecipe(compressed_redstone_block, ri);
        setIngredient(rr, Material.REDSTONE_BLOCK);
        ItemStack li = getItemStack(Material.LAPIS_BLOCK, "圧縮されたラピスラズリブロック");
        ShapedRecipe lr = new ShapedRecipe(compressed_lapis_block, li);
        setIngredient(lr, Material.LAPIS_BLOCK);
        ItemStack ii = getItemStack(Material.IRON_BLOCK, "圧縮された鉄ブロック");
        ShapedRecipe ir = new ShapedRecipe(compressed_iron_block, ii);
        setIngredient(ir, Material.IRON_BLOCK);
        ItemStack ci = getItemStack(Material.COAL_BLOCK, "圧縮された石炭ブロック");
        ShapedRecipe cr = new ShapedRecipe(compressed_coal_block, ci);
        setIngredient(cr, Material.COAL_BLOCK);
        ItemStack gi = getItemStack(Material.GOLD_BLOCK, "圧縮された金ブロック");
        ShapedRecipe gr = new ShapedRecipe(compressed_gold_block, gi);
        setIngredient(gr, Material.GOLD_BLOCK);
        ItemStack di = getItemStack(Material.DIAMOND_BLOCK, "圧縮されたダイヤモンドブロック");
        ShapedRecipe dr = new ShapedRecipe(compressed_diamond_block, di);
        setIngredient(dr, Material.DIAMOND_BLOCK);
        ItemStack ei = getItemStack(Material.EMERALD_BLOCK, "圧縮されたエメラルドブロック");
        ShapedRecipe er = new ShapedRecipe(compressed_emerald_block, ei);
        setIngredient(er, Material.EMERALD_BLOCK);
        // compressed sand
        ItemStack s1i = getItemStack(Material.SAND, "1倍圧縮された砂ブロック");
        ShapedRecipe s1 = new ShapedRecipe(compressed_sand_1, s1i);
        setIngredient(s1, Material.SAND);
        ItemStack s2i = getItemStack(Material.SAND, "2倍圧縮された砂ブロック");
        ShapedRecipe s2 = new ShapedRecipe(compressed_sand_2, s2i);
        setIngredient(s2, s1i);
        ItemStack s3i = getItemStack(Material.SAND, "3倍圧縮された砂ブロック");
        ShapedRecipe s3 = new ShapedRecipe(compressed_sand_3, s3i);
        setIngredient(s3, s2i);
        ItemStack s4i = getItemStack(Material.SAND, "4倍圧縮された砂ブロック");
        ShapedRecipe s4 = new ShapedRecipe(compressed_sand_4, s4i);
        setIngredient(s4, s3i);
        ItemStack s5i = getItemStack(Material.SAND, "5倍圧縮された砂ブロック");
        ShapedRecipe s5 = new ShapedRecipe(compressed_sand_5, s5i);
        setIngredient(s5, s4i);
        ItemStack s6i = getItemStack(Material.SAND, "6倍圧縮された砂ブロック");
        ShapedRecipe s6 = new ShapedRecipe(compressed_sand_6, s6i);
        setIngredient(s6, s5i);
        ItemStack s7i = getItemStack(Material.SAND, "7倍圧縮された砂ブロック");
        ShapedRecipe s7 = new ShapedRecipe(compressed_sand_7, s7i);
        setIngredient(s7, s6i);
        ItemStack s8i = getItemStack(Material.SAND, "8倍圧縮された砂ブロック");
        ShapedRecipe s8 = new ShapedRecipe(compressed_sand_8, s8i);
        setIngredient(s8, s7i);
        // uncompressed sand
        ShapelessRecipe us1 = new ShapelessRecipe(uncompressed_sand_1, new ItemStack(Material.SAND, 9));
        setIngredient(us1, s1i);
        ItemStack us1i = s1i.clone();
        us1i.setAmount(9);
        ShapelessRecipe us2 = new ShapelessRecipe(uncompressed_sand_2, us1i);
        setIngredient(us2, s2i);
        ItemStack us2i = s2i.clone();
        us2i.setAmount(9);
        ShapelessRecipe us3 = new ShapelessRecipe(uncompressed_sand_3, us2i);
        setIngredient(us3, s3i);
        ItemStack us3i = s3i.clone();
        us3i.setAmount(9);
        ShapelessRecipe us4 = new ShapelessRecipe(uncompressed_sand_4, us3i);
        setIngredient(us4, s4i);
        ItemStack us4i = s4i.clone();
        us4i.setAmount(9);
        ShapelessRecipe us5 = new ShapelessRecipe(uncompressed_sand_5, us4i);
        setIngredient(us5, s5i);
        ItemStack us5i = s5i.clone();
        us5i.setAmount(9);
        ShapelessRecipe us6 = new ShapelessRecipe(uncompressed_sand_6, us5i);
        setIngredient(us6, s6i);
        ItemStack us6i = s6i.clone();
        us6i.setAmount(9);
        ShapelessRecipe us7 = new ShapelessRecipe(uncompressed_sand_7, us6i);
        setIngredient(us7, s7i);
        ItemStack us7i = s7i.clone();
        us7i.setAmount(9);
        ShapelessRecipe us8 = new ShapelessRecipe(uncompressed_sand_8, us7i);
        setIngredient(us8, s8i);
        //
        ShapelessRecipe urr = new ShapelessRecipe(uncompressed_redstone_block, new ItemStack(Material.REDSTONE_BLOCK, 9));
        setIngredient(urr, ri);
        ShapelessRecipe ulr = new ShapelessRecipe(uncompressed_lapis_block, new ItemStack(Material.LAPIS_BLOCK, 9));
        setIngredient(ulr, li);
        ShapelessRecipe uir = new ShapelessRecipe(uncompressed_iron_block, new ItemStack(Material.IRON_BLOCK, 9));
        setIngredient(uir, ii);
        ShapelessRecipe ucr = new ShapelessRecipe(uncompressed_coal_block, new ItemStack(Material.COAL_BLOCK, 9));
        setIngredient(ucr, ci);
        ShapelessRecipe ugr = new ShapelessRecipe(uncompressed_gold_block, new ItemStack(Material.GOLD_BLOCK, 9));
        setIngredient(ugr, gi);
        ShapelessRecipe udr = new ShapelessRecipe(uncompressed_diamond_block, new ItemStack(Material.DIAMOND_BLOCK, 9));
        setIngredient(udr, di);
        ShapelessRecipe uer = new ShapelessRecipe(uncompressed_emerald_block, new ItemStack(Material.EMERALD_BLOCK, 9));
        setIngredient(uer, ei);
        addRecipe(s1);
        addRecipe(s2);
        addRecipe(s3);
        addRecipe(s4);
        addRecipe(s5);
        addRecipe(s6);
        addRecipe(s7);
        addRecipe(s8);
        addRecipe(us1);
        addRecipe(us2);
        addRecipe(us3);
        addRecipe(us4);
        addRecipe(us5);
        addRecipe(us6);
        addRecipe(us7);
        addRecipe(us8);
        addRecipe(rr);
        addRecipe(lr);
        addRecipe(ir);
        addRecipe(cr);
        addRecipe(gr);
        addRecipe(dr);
        addRecipe(er);
        addRecipe(urr);
        addRecipe(ulr);
        addRecipe(uir);
        addRecipe(ucr);
        addRecipe(ugr);
        addRecipe(udr);
        addRecipe(uer);
    }

    @Override
    public void onDisable() {
        removeRecipe(compressed_redstone_block);
        removeRecipe(compressed_lapis_block);
        removeRecipe(compressed_iron_block);
        removeRecipe(compressed_gold_block);
        removeRecipe(compressed_emerald_block);
        removeRecipe(compressed_diamond_block);
        removeRecipe(compressed_coal_block);
        removeRecipe(uncompressed_redstone_block);
        removeRecipe(uncompressed_lapis_block);
        removeRecipe(uncompressed_iron_block);
        removeRecipe(uncompressed_gold_block);
        removeRecipe(uncompressed_emerald_block);
        removeRecipe(uncompressed_diamond_block);
        removeRecipe(uncompressed_coal_block);
    }

    public static void setIngredient(ShapedRecipe recipe, Material material) {
        recipe.shape("XXX", "XXX", "XXX");
        recipe.setIngredient('X', new ItemStack(material));
    }

    public static void setIngredient(ShapedRecipe recipe, ItemStack itemStack) {
        recipe.shape("XXX", "XXX", "XXX");
        recipe.setIngredient('X', itemStack);
    }

    public static void setIngredient(ShapelessRecipe recipe, ItemStack item) {
        recipe.addIngredient(item);
    }

    public static boolean isCompressed(ItemStack item) {
        ItemStackUtils util = Paper.itemStack(item);
        NBTTagCompound tag = util.hasTag() ? Objects.requireNonNull(util.getTag(), "tag cannot be null") : util.getOrCreateTag();
        return tag.hasKey("compressed") && tag.getBoolean("compressed");
    }

    public static ItemStack getItemStack(Material material, String displayName) {
        ItemStack item = ClickableItem.of(material, 1, ChatColor.YELLOW + displayName, new ArrayList<>(), e -> {}).getItemStack();
        ItemStackUtils util = Paper.itemStack(item);
        NBTTagCompound tag = util.getOrCreateTag();
        tag.setBoolean("compressed", true);
        util.setTag(tag);
        return util.getItemStack();
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        if (isCompressed(e.getItemInHand())) {
            e.setCancelled(true);
        }
    }
}
