package me.adarsh.godspunkycore.listener;

import me.adarsh.godspunkycore.Skyblock;
import org.bukkit.event.Listener;

public class PListener implements Listener {
    private static int amount = 0;

    protected Skyblock plugin;

    protected PListener() {
        this.plugin = Skyblock.getPlugin();
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
        amount++;
    }

    public static int getAmount() {
        return amount;
    }
}