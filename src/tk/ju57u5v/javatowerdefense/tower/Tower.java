package tk.ju57u5v.javatowerdefense.tower;


import java.awt.Graphics2D;

import tk.ju57u5v.engine.Game;
import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;
import tk.ju57u5v.javatowerdefense.entity.Gegner;

public abstract class Tower extends Entity{
	
	protected double damage,attack_speed,price;
	protected Sprite texture;
	
	public Tower() {
		super();
	}

	@Override
	public void update() {
		Vec2 kuerzeste = new Vec2();
		Gegner gegner = null;
		
		for (Entity e : Game.getRenderer().getEntities()) {
			if (e instanceof Gegner) {
				Vec2 strecke = e.getPosition().minus(getPosition());
				if (strecke.length()<kuerzeste.length()) {
					kuerzeste = strecke;
					gegner = (Gegner) e;
				}
			}
		}
		
		if (gegner != null) {
			shoot(kuerzeste, gegner);
		}
	}

	@Override
	public void render(Graphics2D g) {
		texture.draw(g, getRelativePosition());
	}
	
	public void shoot(Vec2 to, Gegner target) {
		
	}
}