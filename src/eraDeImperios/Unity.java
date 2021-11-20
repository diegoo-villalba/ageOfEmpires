package eraDeImperios;

public class Unity {

	private Position position;
	protected double health = 100.0;
	private int damage = 10;

	public Unity(Position position) {
		this.position = position;
	}

	public double getHealth() {
		return health;
	}

	//This method returns the damage from the unit's attack
	public int getDamage() {
		return damage;
	}

	//This method that give me a distance between two unities.
	public double distanceBetween(Unity u2) {
		return Math.sqrt((Math.pow(u2.position.getX() - this.position.getX(), 2)
				+ (Math.pow(u2.position.getY() - this.position.getY(), 2))));
	}

	// This method damage another unity if both are in a distance of 2 meters or less
	public void attack(Unity u2) {
		if (this.distanceBetween(u2) < 2.0) {
			u2.health -= this.damage;
		}
	}

}
