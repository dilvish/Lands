package org.dilvish.lands.entity;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.World;
import org.bukkit.block.Block;

import com.sk89q.worldedit.CuboidClipboard;
import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.data.DataException;

public class Plan {
	
	private int id;
	private int sizeX;
	private int sizeY;
	
	private World world;
	private Vector pos;
	
	private HashMap<Block, Integer> resourceCost;
	
	private CuboidClipboard plan;
	
	public Plan(World world, Vector pos ) {
		this.pos = pos;
		this.world = world;
		try {
			plan = CuboidClipboard.loadSchematic(new File("plugins/Lands/schematics/Bruma House.schematic"));
		} catch (DataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void build() {
		
		try {
			plan.place(new EditSession(new BukkitWorld(world), 10000), pos, false);
		} catch (MaxChangedBlocksException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
