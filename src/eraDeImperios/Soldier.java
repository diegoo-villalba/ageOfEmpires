package eraDeImperios;

public class Soldier extends Unity{
	
	private int damage = 20;
	
	public Soldier(Position position) {
		super(position);
	}
	
	@Override
	public int getDamage() {
		return this.damage;
	}

	@Override
	public void attack(Unity u2) {
		if (this.distanceBetween(u2) < 1.5) {
			u2.health -= this.damage;
		}
	}


}
