package me.unbqnned.core;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public static String p = ChatColor.GRAY + "[Core]";
	
	@Override
	public void onEnable() {
		getLogger().info(p + "has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
	}
}
