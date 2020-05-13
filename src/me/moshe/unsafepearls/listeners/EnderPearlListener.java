package me.moshe.unsafepearls.listeners;

import me.moshe.unsafepearls.UnsafePearls;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class EnderPearlListener implements Listener {
    private UnsafePearls plugin;
    public EnderPearlListener(UnsafePearls plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPearl(PlayerTeleportEvent e){
        if(e.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL){
            Location to = e.getTo();
            if(to.getBlock().getRelative(BlockFace.UP).getType() != Material.AIR){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "Unsafe teleport destination detected! Telportation cancelled!");
                return;
            }
            if(to.getBlock().getType() != Material.AIR){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "Unsafe teleport destination detected! Telportation cancelled!");
            }
        }
    }
}
