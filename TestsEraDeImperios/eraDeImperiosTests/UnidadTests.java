package eraDeImperiosTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import eraDeImperios.Archer;
import eraDeImperios.Cavalier;
import eraDeImperios.Position;
import eraDeImperios.Soldier;
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
	
	@Test
	public void cavalierAttackTest() {

		Cavalier c1 = new Cavalier(new Position(0, 0));
		Unity u2 = new Unity(new Position(1.5, 1.5));
		
		assertEquals(100, u2.getHealth(), 0.0);
		c1.attack(u2);
		assertEquals(70, u2.getHealth(), 0.0);
		
	}
	
	@Test
	public void soldierAttackTest() {

		Soldier s1 = new Soldier(new Position(0, 0));
		Unity u2 = new Unity(new Position(1.0, 1.0));
		
		assertEquals(100, u2.getHealth(), 0.0);
		s1.attack(u2);
		assertEquals(80, u2.getHealth(), 0.0);
		
	}
	
	@Test
	public void archerAttackTest() {

		Archer a1 = new Archer(new Position(0, 0));
		Unity u2 = new Unity(new Position(6.0, 6.0));
		
		assertEquals(100, u2.getHealth(), 0.0);
		a1.attack(u2);
		assertEquals(93, u2.getHealth(), 0.0);
		
	}

}
