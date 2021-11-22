package eraDeImperios;

public class Soldier extends Unity {

	private int damage = 20;
	private int attacks = 5;

	public Soldier(Position position) {
		super(position);
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	// This method asks if the soldier can battle yet
	boolean haveEnergy() {
		return this.attacks > 0;
	}

	// This method renew the energy of the soldier
	public void rest() {
		this.attacks = 5;
	}

	/*
	 * When the soldier attacks, he/she lost a little bit of energy. If he/she
	 * doesn't have energy, he/she can't attack
	 */
	@Override
	public void attack(Unity u2) {
		if (this.haveEnergy() && this.distanceBetween(u2) < 1.5) {
			u2.health -= this.damage;
			this.attacks -= 1;
		}
	}

}
