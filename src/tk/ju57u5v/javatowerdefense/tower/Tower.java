package tk.ju57u5v.javatowerdefense.tower;

import java.awt.Graphics2D;

import tk.ju57u5v.engine.Game;
import tk.ju57u5v.engine.components.Entity;
import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;
import tk.ju57u5v.javatowerdefense.entity.Gegner;
import tk.ju57u5v.javatowerdefense.entity.schuss.Schuss;

public abstract class Tower extends Entity {

	protected double damage, attack_speed, price, range, shotCooldown;
	protected Sprite texture;
	protected Sprite shotTexture;
	private double cooldownCounter = 0;

	public Tower() {
		super();
		this.initialise();
	}

	@Override
	public void update() {
		if (cooldownCounter > 0) {
			cooldownCounter--;
			return; // Wir wollen keinen Gegner suchen wenn wir nicht schießen
					// können
		}
		// Gegner suchen
		Vec2 kuerzeste = new Vec2(Double.MAX_VALUE, Double.MAX_VALUE);
		Gegner gegner = null;

		for (Entity e : Game.getRenderer().getEntities()) {
			if (e instanceof Gegner) {
				Vec2 strecke = e.getPosition().minus(getPosition());
				if (strecke.length() < kuerzeste.length()) {
					kuerzeste = strecke;
					gegner = (Gegner) e;
				}
			}
		}

		if (gegner != null && kuerzeste.length() <= range && cooldownCounter <= 0) {
			shoot(gegner);
			cooldownCounter = shotCooldown;
		}
	}

	@Override
	public void render(Graphics2D g) {
		texture.draw(g, getRelativePosition());
	}

	public void shoot(Gegner target) {
		new Schuss(shotTexture, target, damage).setPosition(this.getPosition().plus(this.getDimension().div(2)));
	}
}