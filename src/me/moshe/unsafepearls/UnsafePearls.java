package me.moshe.unsafepearls;

import me.moshe.unsafepearls.listeners.EnderPearlListener;
import org.bukkit.plugin.java.JavaPlugin;

public class UnsafePearls extends JavaPlugin {

    public void onEnable(){
        getServer().getPluginManager().registerEvents(new EnderPearlListener(this), this);
    }
}
