package tk.ju57u5v.javatowerdefense.entity;

import tk.ju57u5v.engine.Game;


public class Fliesentisch extends Gegner {

	public Fliesentisch () {
		speed=2;
		life=1;
		damage=1;
		exp=1;
		money_droped=1;
		texture = Game.getResourceManager().getResource("fliesentisch");
		this.initialise();
	}
	
	

}
