package tk.ju57u5v.javatowerdefense.entity.schuss;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.TwoDMath;
import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;
import tk.ju57u5v.javatowerdefense.entity.Gegner;

public class Schuss extends Entity{
	private final Sprite spirte;
	private final Gegner target;
	private final double speed = 5;
	private final double damage;

	public Schuss(Sprite sprite, Gegner target, double damage) {
		this.spirte=sprite;
		this.target=target;
		this.damage=damage;
		this.initialise();
		
	}

	@Override
	public void update() {
		if(TwoDMath.isRectInRect(getPosition(), getDimension(), target.getPosition(), target.getDimension())) {
			target.damage(damage);
			this.destroy();
		} else {
			Vec2 moveVec = target.getPosition().minus(this.getPosition()).plus(target.getDimension().div(2)).normalize();
			this.setPosition(this.getPosition().plus(moveVec.multiply(speed)));
		}
	}

	@Override
	public void render(Graphics2D g) {
		spirte.draw(g, getRelativePosition());
	}
	
	

}
