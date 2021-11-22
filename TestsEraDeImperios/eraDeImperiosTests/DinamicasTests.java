package eraDeImperiosTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import eraDeImperios.Archer;
import eraDeImperios.Cavalier;
import eraDeImperios.Position;
import eraDeImperios.Soldier;
import eraDeImperios.Unity;

public class DinamicasTests {

	@Test
	public void noTieneFlechasTest() {
		Archer a1 = new Archer(new Position(0, 0));
		Unity u2 = new Unity(new Position(6.0, 6.0));

		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		assertEquals(30.00, u2.getHealth(), 0.0);
		a1.attack(u2);
		// Si se queda sin flechas ya no puede danar a la otra unidad
		assertEquals(30.00, u2.getHealth(), 0.0);
	}

	@Test
	public void recargaFlechasTest() {
		Archer a1 = new Archer(new Position(0, 0));
		Unity u2 = new Unity(new Position(6.0, 6.0));
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		a1.attack(u2);
		assertEquals(30.00, u2.getHealth(), 0.0);
		a1.attack(u2);
		// Si se queda sin flechas ya no puede danar a la otra unidad
		assertEquals(30.00, u2.getHealth(), 0.0);
		// Recarga flechas y puede seguir atacando.
		a1.reload();
		a1.attack(u2);
		a1.attack(u2);
		assertEquals(16.00, u2.getHealth(), 0.0);
	}

	@Test
	public void soldadoSinEnergiaTest() {

		Soldier s1 = new Soldier(new Position(0, 0));
		Unity u2 = new Unity(new Position(1.0, 1.0));

		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		assertEquals(0.0, u2.getHealth(), 0.0);
		s1.attack(u2);
		// Si se queda sin energias ya no puede danar a la otra unidad
		assertEquals(0.0, u2.getHealth(), 0.0);

	}

	@Test
	public void recuperamosEnergiaTest() {

		Soldier s1 = new Soldier(new Position(0, 0));
		Unity u2 = new Unity(new Position(1.0, 1.0));
		Unity u3 = new Unity(new Position(1.0, 1.0));

		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		s1.attack(u2);
		assertEquals(0.0, u2.getHealth(), 0.0);
		s1.attack(u2);
		// Si se queda sin energias ya no puede danar a la otra unidad
		assertEquals(0.0, u2.getHealth(), 0.0);
		// Recupera energias y sigue atacando a otra unidad
		s1.rest();
		s1.attack(u3);
		s1.attack(u3);
		assertEquals(60.0, u3.getHealth(), 0.0);

	}

	@Test
	public void seEscapaElCaballoTest() {

		Cavalier c1 = new Cavalier(new Position(0, 0));
		Unity u2 = new Unity(new Position(1.5, 1.5));
		
		c1.attack(u2);
		assertEquals(70.0, u2.getHealth(), 0.0);
		c1.attack(u2);
		//Si se escapa el caballo el jinete no puede atacar.
		assertEquals(70.0, u2.getHealth(), 0.0);
		c1.attack(u2);
		//El caballo regresa y puede atacar nuevamente
		assertEquals(40.0, u2.getHealth(), 0.0);
		
	}
}
