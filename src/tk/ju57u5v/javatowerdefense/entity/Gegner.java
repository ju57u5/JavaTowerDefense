package tk.ju57u5v.javatowerdefense.entity;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.Game;
import tk.ju57u5v.engine.TwoDMath;
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
			
			Tile[][] tiles = Game.getTileManager().getTiles();
			
			for (int c=0; c<tiles.length;c++) {
				for (int i=0; i<tiles[1].length;i++) {
					if (TwoDMath.isRectInRect(getX(), getY(), getWidth(), getHeight(), tiles[c][i].getX(), tiles[c][i].getY(), tiles[c][i].getWidth(), tiles[c][i].getHeight())) {
						
						if (tiles[c+1][i].getTexture()==2 && tiles[c+1][i] != vorher) {
							this.moveTo(tiles[c+1][i].getMiddel(),speed);
							
						} else if (c != 0 && tiles[c-1][i].getTexture()==2 && tiles[c-1][i] != vorher) {
							this.moveTo(tiles[c-1][i].getMiddel(),speed);
							
						} else if (tiles[c][i+1].getTexture()==2 && tiles[c][i+1] != vorher) {
							this.moveTo(tiles[c][i+1].getMiddel(),speed);
							
						} else if (i != 0 && tiles[c][i-1].getTexture()==2 && tiles[c][i-1] != vorher) {
							this.moveTo(tiles[c][i-1].getMiddel(),speed);
							
						} else {
							started=false;
							System.out.println("finished");
						}
						
						vorher=tiles[c][i];
					}
				}
			}
		}
	}


	@Override
	public void render(Graphics2D g) {
		super.render(g);
		texture.draw(g, getRelativePosition());
	}
	
	public void start() {
		setPosition(startPos);
		started=true;
	}
}
