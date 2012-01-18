package org.dilvish.lands.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.dilvish.lands.Lands;
import org.dilvish.lands.entity.Plan;

import com.sk89q.worldedit.Vector;

public class LandsCommandExecutor implements CommandExecutor {

	private Lands plugin;

	public LandsCommandExecutor(Lands plugin) {
		super();
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}

		if (command.getName().equalsIgnoreCase("basic")) { 
			Plan p = new Plan(player.getWorld(), new Vector(player.getLocation().getX(),player.getLocation().getY(),player.getLocation().getZ() + 20));
			p.build();
			return true;
		}
		return false;
	}

}
