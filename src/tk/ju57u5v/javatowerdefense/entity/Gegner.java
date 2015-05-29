package tk.ju57u5v.javatowerdefense.entity;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.Game;
import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;
import tk.ju57u5v.engine.world.Tile;

public abstract class Gegner extends Entity {

	protected Sprite texture;
	protected double speed,life,damage,exp,money_droped;
	private boolean started = false;
	private Vec2 startPos = new Vec2();
	private Tile vorher;
	
	public Gegner() {
		super();
	}

	@Override
	public void update() {
		super.update();
		if (started) {
			Tile t = Game.getTileManager().tileAtPosition(getX(), getY());
			Tile[][] tiles = Game.getTileManager().getTiles();
			for (int c=0; c<tiles.length;c++) {
				for (int i=0; i<tiles[1].length;i++) {
					if (t==tiles[c][i]) {
						if (tiles[c+1][i].getTexture()==2 && tiles[c+1][i] != vorher) {
							this.moveTo(tiles[c+1][i].getMiddel(),speed);
						} else if (tiles[c-1][i].getTexture()==2 && tiles[c-1][i] != vorher) {
							this.moveTo(tiles[c-1][i].getMiddel(),speed);
						} else if (tiles[c][i+1].getTexture()==2 && tiles[c][i+1] != vorher) {
							this.moveTo(tiles[c][i+1].getMiddel(),speed);
						} else if (tiles[c][i-1].getTexture()==2 && tiles[c][i-1] != vorher) {
							this.moveTo(tiles[c][i-1].getMiddel(),speed);
						}
						
						vorher=t;
					}
				}
			}
		}
	}


	@Override
	public void render(Graphics2D g) {
		super.render(g);
		
	}
	
	public void start() {
		setPosition(startPos);
		started=true;
	}
	
	

}
