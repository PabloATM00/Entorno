import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class EjemplosTest {

	@Test
	void test() {
		realizaPruebaCierto();
		realizaPruebaFalso();
		realizaPruebaIguales();

	}

	private void realizaPruebaIguales() {
		assertEquals(Ejemplos.divideDiez (20) , 2 );
		assertEquals(Ejemplos.divideDiez (30) , 3 );
		assertEquals(Ejemplos.divideDiez (100) , 10 );
		assertEquals(Ejemplos.divideDiez (50) , 5 );
		assertEquals(Ejemplos.divideDiez (40) , 4 );
		
		assertEquals(Ejemplos.Sumacinco (20) , 25 );
		assertEquals(Ejemplos.Sumacinco (30) , 35 );
		assertEquals(Ejemplos.Sumacinco (100) , 105 );
		assertEquals(Ejemplos.Sumacinco (50) , 55 );
		assertEquals(Ejemplos.Sumacinco (40) , 45 );
		
		assertEquals(Ejemplos.Restaquince (20) , 5 );
		assertEquals(Ejemplos.Restaquince (30) , 15 );
		assertEquals(Ejemplos.Restaquince (100) , 85 );
		assertEquals(Ejemplos.Restaquince (50) , 35 );
		assertEquals(Ejemplos.Restaquince (40) , 25 );
		
	}

	private void realizaPruebaFalso() {
		assertFalse(Ejemplos.divideDiez(15) > 10);
		assertFalse(Ejemplos.divideDiez(20) > 2);
		assertFalse(Ejemplos.divideDiez(30) > 10);
		assertFalse(Ejemplos.divideDiez(50) > 5);
		assertFalse(Ejemplos.divideDiez(60) > 7 );
		
		assertFalse(Ejemplos.Sumacinco(10) > 20);
		assertFalse(Ejemplos.Sumacinco(5) == 11);
		assertFalse(Ejemplos.Sumacinco(20) < 15 );
		assertFalse(Ejemplos.Sumacinco(40) < 40);
		assertFalse(Ejemplos.Sumacinco(30) > 36);
		
		assertFalse(Ejemplos.Restaquince (20) > 5 );
		assertFalse(Ejemplos.Restaquince (30) < 15 );
		assertFalse(Ejemplos.Restaquince (100) > 85 );
		assertFalse(Ejemplos.Restaquince (50) < 35 );
		assertFalse(Ejemplos.Restaquince (40) > 35 );
		
	}

	private void realizaPruebaCierto() {
		assertTrue(Ejemplos.Sumacinco(10) == 15);
		assertTrue(Ejemplos.Sumacinco(5) == 10);
		assertTrue(Ejemplos.Sumacinco(20) == 25);
		assertTrue(Ejemplos.Sumacinco(40) == 45);
		assertTrue(Ejemplos.Sumacinco(30) == 35);
		
		assertTrue(Ejemplos.divideDiez(10) < 10);
		assertTrue(Ejemplos.divideDiez(25) < 3 );
		assertTrue(Ejemplos.divideDiez(20) < 4);
		assertTrue(Ejemplos.divideDiez(40) <5);
		assertTrue(Ejemplos.divideDiez(30) == 3);
		
		assertTrue(Ejemplos.Restaquince (20) == 5 );
		assertTrue(Ejemplos.Restaquince (30) > 10 );
		assertTrue(Ejemplos.Restaquince (100) < 95 );
		assertTrue(Ejemplos.Restaquince (50) < 40 );
		assertTrue(Ejemplos.Restaquince (40) > 20 );

	}

}
