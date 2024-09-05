package me.godspunky.skyblock.gui;


import me.godspunky.skyblock.user.User;
import me.godspunky.skyblock.util.SUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class BitShopGUI extends GUI {
    public BitShopGUI() {
        super("Community Shop", 54);
    }

    @Override
    public void onOpen(GUIOpenEvent e) {
        fill(BLACK_STAINED_GLASS_PANE,0,18);
        fill(BLACK_STAINED_GLASS_PANE,26,27);
        fill(BLACK_STAINED_GLASS_PANE,35,36);
        fill(BLACK_STAINED_GLASS_PANE,44,53);

        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());

        // city project
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                GUIType.CITY_PROJECT.getGUI().open(player);
            }

            @Override
            public int getSlot() {
                return 1;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.GREEN + "City Project", Material.GOLD_BARDING, (short) 0, 1,
                        ChatColor.GRAY + "Participate with the whole",
                        ChatColor.GRAY + "SkyBlock community to upgrade",
                        ChatColor.GRAY + "the village and more.",
                        " ",
                        ChatColor.AQUA + "Contribute " + ChatColor.GRAY + "to various",
                        ChatColor.GRAY + "project to obtain unique",
                        ChatColor.GRAY + "perks.",
                        "",
                        ChatColor.YELLOW + "Click to view!");
            }
        });

        // Account & Profile Upgrade
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 2;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.LIGHT_PURPLE + "Account & Profile Upgrades", Material.HOPPER, (short) 0, 1,
                        ChatColor.GRAY + "Upgrade your current profile and",
                        ChatColor.GRAY + "your SkyBlock account with",
                        ChatColor.GRAY + "permanent upgrades.",
                        " ",
                        ChatColor.GRAY + "Profile: " + ChatColor.DARK_GRAY + "Nothing going on!",
                        ChatColor.GRAY + "Account:" + ChatColor.DARK_GRAY + "None underway!",
                        "",
                        ChatColor.YELLOW + "Click to view!");
            }
        });

        // Booster Cookie
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                GUIType.BOOSTER_COOKIE_SHOP.getGUI().open(player);
            }

            @Override
            public int getSlot() {
                return 3;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.GOLD + "Booster Cookie", Material.COOKIE, (short) 0, 1,
                        ChatColor.GRAY + "Obtain a temporary buff",
                        ChatColor.GRAY + "letting you earn " + ChatColor.AQUA + "bits",
                        ChatColor.GRAY + "as well as " + ChatColor.LIGHT_PURPLE + "tons of perks.",
                        " ",
                        ChatColor.YELLOW + "Click to view!");
            }
        });

        // Bits Shop
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 4;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.AQUA + "Bits Shop", Material.DIAMOND, (short) 0, 1,
                        ChatColor.GRAY + "Spend" + ChatColor.AQUA + " bits " + ChatColor.GRAY + "on a variety of",
                        ChatColor.GRAY + "powerful items.",
                        "",
                        ChatColor.GRAY + "Earn bits from " + ChatColor.GOLD + "Booster Cookie.",
                        " ",
                        ChatColor.GREEN + "Currently Selected!");
            }
        });

        // Fire Sale
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                GUIType.FIRE_SALE.getGUI().open(player);
            }

            @Override
            public int getSlot() {
                return 5;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.translateAlternateColorCodes('&',"&6♨ &c&lFIRE &cSales &6♨"), Material.BLAZE_POWDER, (short) 0, 1,
                        ChatColor.GRAY + "Acquire " + ChatColor.GOLD + "exclusive" + ChatColor.GRAY + "cosmetics",
                        ChatColor.GRAY + "which are only available in",
                        ChatColor.RED + "limited quantity" + ChatColor.GRAY + " across all",
                        ChatColor.GRAY + "of SkyBlock",
                        " ",
                        ChatColor.DARK_GRAY + "No ongoing sale!",
                        "",
                        ChatColor.YELLOW + "Click to view!");
            }
        });

        // Rank
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 7;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.YELLOW + "LocalHost Ranks", Material.EMERALD, (short) 0, 1,
                        ChatColor.GRAY + "Browse the SkyBlock perks of" ,
                        ChatColor.GRAY + "our " + ChatColor.YELLOW + "server-wide" + ChatColor.GRAY + " ranks such",
                        ChatColor.GRAY + "as the " + ChatColor.GOLD+"[MVP"+ChatColor.RED+"++"+ChatColor.GOLD+"]"+ChatColor.GRAY+" rank.",
                        ChatColor.GRAY + "of SkyBlock",
                        " ",
                        ChatColor.YELLOW + "Click to view!");
            }
        });

        // Gray Glass
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 12;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 7, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 11;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 7, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 10;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 7, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 14;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 7, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 16;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 7, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });

        //Lime Glass
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
            }

            @Override
            public int getSlot() {
                return 13;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.DARK_GRAY + "▲ " +ChatColor.GRAY+"Categories", Material.STAINED_GLASS_PANE, (short) 5, 1,
                        ChatColor.DARK_GRAY + "▼ " +ChatColor.GRAY+"Items");
            }
        });



        // GOD POTION
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                player.sendMessage(ChatColor.RED+"Coming Soon!");
                player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT,1.0f,1.0f);
            }

            @Override
            public int getSlot() {
                return 19;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getSkullURLStack(ChatColor.RED + "God Potion","60226d4c1d30fbebecae939da900603e4cd0fed8592a1bb3e11f9ac92391a45a", 1,
                        ChatColor.translateAlternateColorCodes('&',"&7COnsume this potion to receive an"),
                        ChatColor.translateAlternateColorCodes('&',"&7assortment of positive &dpotion"),
                        ChatColor.LIGHT_PURPLE+"effects!",
                        "",
                        ChatColor.translateAlternateColorCodes('&',"&7Duration:"),
                        ChatColor.translateAlternateColorCodes('&',"&a12 hours"),
                        "",
                        ChatColor.translateAlternateColorCodes('&',"&eRight-click to consume"),
                        "",
                        ChatColor.translateAlternateColorCodes('&',"&c&lSPECIAL"),
                        "",
                        ChatColor.GRAY+"Cost: ",
                        ChatColor.AQUA+"1,500 Bits",
                        "",
                        ChatColor.YELLOW+"Click to trade!");
            }
        });

        // Link
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                player.sendMessage(ChatColor.AQUA+"https://godspunky.store/");
            }

            @Override
            public int getSlot() {
                return 49;
            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(ChatColor.GREEN + "Community Shop", Material.EMERALD, (short) 0, 1,
                        "",
                        ChatColor.DARK_GRAY + "Elizabeth",
                        "",
                        ChatColor.translateAlternateColorCodes('&',"&7Gems: "),
                        ChatColor.translateAlternateColorCodes('&',"&8Purchase on godspunky.store"),
                        " ",
                        ChatColor.translateAlternateColorCodes('&',"&7Bits: &bN/A"),
                        ChatColor.translateAlternateColorCodes('&',"&8Earn from Booster Cookies!"),
                        "",
                        ChatColor.translateAlternateColorCodes('&',"&7Fame Rank: &eNew player"),
                        ChatColor.translateAlternateColorCodes('&',"&8rank up by spending gems &"),
                        ChatColor.translateAlternateColorCodes('&',"&8bits!"),
                        "",
                        ChatColor.GRAY+"Store: "+ChatColor.AQUA+"godspunky.store",
                        ChatColor.YELLOW+"Click to get link!");
            }
        });

    }
}