package eraDeImperios;

public class Archer extends Unity {

	private int damage = 7;
	private int arrows = 10;

	public Archer(Position position) {
		super(position);
	}

	@Override
	public int getDamage() {
		return this.damage;
	}
	
	//This method asks if the archer has arrows
	boolean haveArrows() {
		return this.arrows > 0;
	}
	
	//This method reload the arrows of the archer
	public void reload() {
		this.arrows = 10;
	}

	/*When the archer attacks, he/she lost one arrow. If he/she
	doesn't have any arrow, he/she can't attack*/
	@Override
	public void attack(Unity u2) {
		if (haveArrows() && this.distanceBetween(u2) > 5.0 && this.distanceBetween(u2) < 25.0) {
			u2.health -= this.damage;
			this.arrows -= 1;
		}
	}
}
