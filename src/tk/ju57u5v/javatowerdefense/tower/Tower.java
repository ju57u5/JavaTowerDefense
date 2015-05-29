package tk.ju57u5v.javatowerdefense.tower;


import tk.ju57u5v.engine.components.Vec2;
import tk.ju57u5v.engine.graphics.Sprite;

public abstract class Tower{
	
	protected double damage,attack_speed,price;
	protected Sprite texture;
	private Vec2 Pos = new Vec2();
	
	public Tower() {
		super();
	}
	
}