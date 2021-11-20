package eraDeImperios;

public class Archer extends Unity {

	private int damage = 7;

	public Archer(Position position) {
		super(position);
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	@Override
	public void attack(Unity u2) {
		if (this.distanceBetween(u2) > 5.0 && this.distanceBetween(u2) < 25.0) {
			u2.health -= this.damage;
		}
	}
}
