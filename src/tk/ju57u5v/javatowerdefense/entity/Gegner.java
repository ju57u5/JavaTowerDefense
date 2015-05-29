package tk.ju57u5v.javatowerdefense.entity;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;

public abstract class Gegner extends Entity {

	protected Sprite texture;
	protected double speed,life,damage,exp,drops;
	private boolean started = false;
	private Vec2 startPos = new Vec2();
	
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
	
	public void start() {
		setPosition(startPos);
		started=true;
	}
	
	

}
