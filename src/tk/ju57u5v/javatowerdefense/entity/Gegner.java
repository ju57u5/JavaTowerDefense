package tk.ju57u5v.javatowerdefense.entity;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.graphics.Sprite;

public abstract class Gegner extends Entity {

	protected Sprite texture;
	protected double speed;
	protected double leben;
	protected double damage;
	private boolean started = false;
	
	public Gegner() {
		super();
	}

	@Override
	public void update() {
		super.update();
		if (started) {
			
		}
	}


	@Override
	public void render(Graphics2D g) {
		super.render(g);
		
	}
	
	

}
