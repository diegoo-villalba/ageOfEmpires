package eraDeImperios;

public class Cavalier extends Unity {

	private int damage = 30;
	private int attacks = 5;

	public Cavalier(Position position) {
		super(position);
	}
	
	public int getAttacks() {
		return attacks;
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	// This method asks if the soldier can battle yet
	boolean haveEnergy() {
		return this.attacks > 0;
	}

	// This method renew the energy of the cavalier
	public void rest() {
		this.attacks = 5;
	}

	private boolean evenNumber() {
		return this.getAttacks() % 2 == 0;

	}

	@Override
	public void attack(Unity u2) {

		if (haveEnergy() && evenNumber() && this.distanceBetween(u2) > 1.0 && this.distanceBetween(u2) < 3.0) {
			this.attacks -= 1;
			System.out.println("F#%CK!! Get over here!");
		}

		else if (haveEnergy() && this.distanceBetween(u2) > 1.0 && this.distanceBetween(u2) < 3.0) {
			u2.health -= this.damage;
			this.attacks -= 1;
		}

		/*
		 * else if (haveEnergy() && this.attacks % 3 == 0 && this.distanceBetween(u2) >
		 * 1.0 && this.distanceBetween(u2) < 3.0) { this.attacks -= 1;
		 * System.out.println("Get over here!"); }
		 */
	}

}
