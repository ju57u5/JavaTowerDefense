package tk.ju57u5v.javatowerdefense.tower;

import tk.ju57u5v.engine.Game;

public class Mod extends Tower {
	
	public Mod(){
		damage = 1;
		attack_speed = 1;
		price = 100;
		range=100;
		shotCooldown=50;
		texture = Game.getResourceManager().getSprite("mod");
		shotTexture = Game.getResourceManager().getSprite("shoot");
		this.setDimension(texture.getDimensions());
	}
	
}