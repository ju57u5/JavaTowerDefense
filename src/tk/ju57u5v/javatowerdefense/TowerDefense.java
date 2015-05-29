package tk.ju57u5v.javatowerdefense;

import tk.ju57u5v.engine.Game;

public class TowerDefense extends Game {

	public TowerDefense(String[] args) {
		super(args);
		this.initalizeGame();
		kamera.setIsometric(false);
	}

	@Override
	public void tick() {
		
	}

	public static void main(String[] args) {
		Game.name="JavaTowerDefense";
		TowerDefense.build(new TowerDefense(args));
	}
	
	

}
