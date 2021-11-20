package eraDeImperiosTests;

import static org.junit.Assert.*;

import org.junit.Test;

import eraDeImperios.Position;
import eraDeImperios.Unity;

public class UnidadTests {

	@Test
	public void existTest() {
		Unity u1 = new Unity(new Position(0, 0));
		assertNotNull(u1);
	}

	@Test
	public void distanceBetweenTest() {
		Unity u1 = new Unity(new Position(0, 0));
		Unity u2 = new Unity(new Position(1, 1));
		assertEquals(Math.sqrt(2), u1.distanceBetween(u2), 0.0);
	}

	@Test
	public void attackTest() {

		Unity u1 = new Unity(new Position(0, 0));
		Unity u2 = new Unity(new Position(1, 1));
		Unity u3 = new Unity(new Position(2, 2));

		assertEquals(100, u2.getHealth(), 0.0);
		u1.attack(u2);
		assertEquals(90, u2.getHealth(), 0.0);

		assertEquals(100, u3.getHealth(), 0.0);
		u1.attack(u3);
		assertEquals(100, u3.getHealth(), 0.0);

	}

}
