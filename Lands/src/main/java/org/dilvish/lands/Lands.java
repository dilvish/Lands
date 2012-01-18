package org.dilvish.lands;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dilvish.lands.listeners.LandsPlayerListener;

public class Lands extends JavaPlugin {

	public static Lands plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	public void onDisable() {

		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " disabled. ");

	}

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_MOVE, new LandsPlayerListener(this), Event.Priority.Normal, this);
		
		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " version " + pdFile.getVersion()
				+ " enabled. ");

	}

}
