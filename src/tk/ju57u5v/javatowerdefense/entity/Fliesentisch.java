package tk.ju57u5v.javatowerdefense.entity;

import tk.ju57u5v.engine.Game;


public class Fliesentisch extends Gegner {

	public Fliesentisch () {
		speed=2;
		life=2;
		damage=1;
		exp=1;
		money_droped=1;
		texture = Game.getResourceManager().getSprite("fliesentisch");
		this.initialise();
	}
	
	

}
