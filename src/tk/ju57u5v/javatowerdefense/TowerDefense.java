package tk.ju57u5v.javatowerdefense;

import tk.ju57u5v.engine.Game;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.world.Tile;
import tk.ju57u5v.javatowerdefense.entity.Fliesentisch;

public class TowerDefense extends Game {
	
	private Tile[][] tiles = tileManager.getTiles();

	public TowerDefense(String[] args) {
		super(args);
		this.initalizeGame();
		kamera.setIsometric(false);
		kamera.setDimension(new Vec2(1000,1000));
	}

	@Override
	public void tick() {
		
	}

	public static void main(String[] args) {
		Game.name="JavaTowerDefense";
		TowerDefense.build(new TowerDefense(args));
	}

	@Override
	public void startGame() {
		super.startGame();
		
		for (int i=0;i<tiles.length;i++) {
			for (int c=0;c<tiles[1].length;c++) {
				tiles[i][c]=new Tile(0);
				tiles[i][c].setPosition(new Vec2(200*i,200*c));
			}
		}
		
		tiles[0][0]=new Tile(2);
		tiles[0][0].setPosition(new Vec2(200*0,200*0));
		
		tiles[1][0]=new Tile(2);
		tiles[1][0].setPosition(new Vec2(200*1,200*0));
		
		tiles[2][0]=new Tile(2);
		tiles[2][0].setPosition(new Vec2(200*2,200*0));
		
		tiles[3][0]=new Tile(2);
		tiles[3][0].setPosition(new Vec2(200*3,200*0));
		
		new Fliesentisch().start();
	}
	
	

}
