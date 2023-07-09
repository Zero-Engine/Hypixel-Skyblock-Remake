package me.adarsh.godspunkycore.command;

import me.adarsh.godspunkycore.features.ranks.PlayerRank;
import org.bukkit.entity.Player;

@CommandParameters(aliases = "setmountain", permission = PlayerRank.ADMIN)
public class SetMountainCommand extends SCommand{
    @Override
    public void run(CommandSource sender, String[] args) {
        Player player = sender.getPlayer();
        // Retrieve the player's location
        double x = player.getLocation().getX();
        double y = player.getLocation().getY();
        double z = player.getLocation().getZ();
        float yaw = player.getLocation().getYaw();
        float pitch = player.getLocation().getPitch();

        // Update the config values
        plugin.getConfig().set("hub.mountain_x", x);
        plugin.getConfig().set("hub.mountain_y", y);
        plugin.getConfig().set("hub.mountain_z", z);
        plugin.getConfig().set("hub.mountain_yaw", yaw);
        plugin.getConfig().set("hub.mountain_pitch", pitch);

        // Save the changes to the config file
        plugin.saveConfig();

        player.sendMessage("Hub location set!");
    }
}
