package org.dilvish.lands;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Lands extends JavaPlugin {

	public static Lands plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	public void onDisable() {

		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " disabled. ");

	}

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " version " + pdFile.getVersion()
				+ " enabled. ");

	}

}
