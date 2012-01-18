package org.dilvish.lands.listener;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.dilvish.lands.Lands;

public class LandsPlayerListener extends PlayerListener {
	
	public Lands plugin;
	
	public LandsPlayerListener(Lands plugin) {
		this.plugin = plugin;
	}
	
    public void onPlayerMove(PlayerMoveEvent evt) {
//    	Location loc = evt.getPlayer().getLocation();
//    	World w = loc.getWorld();
//    	loc.setY(loc.getY() + 5);
//    	Block b = w.getBlockAt(loc);
//    	b.setTypeId(1);
    }
    
}
