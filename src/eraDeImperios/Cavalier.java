package eraDeImperios;

public class Cavalier extends Unity {

	private int damage = 30;

	public Cavalier(Position position) {
		super(position);
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	@Override
	public void attack(Unity u2) {
		if (this.distanceBetween(u2) > 1.0 && this.distanceBetween(u2) < 3.0) {
			u2.health -= this.damage;
		}
	}

}
