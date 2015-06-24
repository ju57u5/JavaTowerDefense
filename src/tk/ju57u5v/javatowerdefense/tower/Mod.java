package tk.ju57u5v.javatowerdefense.tower;

import tk.ju57u5v.engine.Game;

public class Mod extends Tower {
	
	public Mod(){
		damage = 1;
		attack_speed = 1;
		price = 100;
		range=100;
		shotCooldown=10;
		texture = Game.getResourceManager().getResource("mod");
		shotTexture = Game.getResourceManager().getResource("shoot");
		this.setDimension(texture.getDimensions());
	}
	
}