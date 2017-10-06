package de.thcproductions.nsuluofuo.graphics.tiles;

import de.thcproductions.nsuluofuo.graphics.Assets;

public class WaterTile extends Tile {

	public WaterTile(int id) {
		super(Assets.water, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
	

}
