package unico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Metodos_Java {

	
	@Test
	void test() {
		realizaPruebaCierto();
		realizaPruebaFalso();
		realizaPruebaIguales();

	}
	private void realizaPruebaIguales() {
		assertEquals(Tipos_prueba.divideDiez (20) , 2 );
		assertEquals(Tipos_prueba.divideDiez (30) , 3 );
		assertEquals(Tipos_prueba.divideDiez (100) , 10 );
		assertEquals(Tipos_prueba.divideDiez (50) , 5 );
		assertEquals(Tipos_prueba.divideDiez (40) , 4 );
		
		assertEquals(Tipos_prueba.Sumacinco (20) , 25 );
		assertEquals(Tipos_prueba.Sumacinco (30) , 35 );
		assertEquals(Tipos_prueba.Sumacinco (100) , 105 );
		assertEquals(Tipos_prueba.Sumacinco (50) , 55 );
		assertEquals(Tipos_prueba.Sumacinco (40) , 45 );
		
		assertEquals(Tipos_prueba.Restaquince (20) , 5 );
		assertEquals(Tipos_prueba.Restaquince (30) , 15 );
		assertEquals(Tipos_prueba.Restaquince (100) , 85 );
		assertEquals(Tipos_prueba.Restaquince (50) , 35 );
		assertEquals(Tipos_prueba.Restaquince (40) , 25 );
		
	}
	private void realizaPruebaFalso() {
		assertFalse(Tipos_prueba.divideDiez(15) > 5);
		assertFalse(Tipos_prueba.divideDiez(20) < 1);
		assertFalse(Tipos_prueba.divideDiez(30) == 10);
		assertFalse(Tipos_prueba.divideDiez(50) > 5);
		assertFalse(Tipos_prueba.divideDiez(60) > 7 );
		
		assertFalse(Tipos_prueba.Sumacinco(10) > 20);
		assertFalse(Tipos_prueba.Sumacinco(5) == 11);
		assertFalse(Tipos_prueba.Sumacinco(20) < 15 );
		assertFalse(Tipos_prueba.Sumacinco(40) < 40);
		assertFalse(Tipos_prueba.Sumacinco(30) > 35);
		
		assertFalse(Tipos_prueba.Restaquince (20) > 5 );
		assertFalse(Tipos_prueba.Restaquince (30) < 10 );
		assertFalse(Tipos_prueba.Restaquince (100) > 85 );
		assertFalse(Tipos_prueba.Restaquince (50) < 35 );
		assertFalse(Tipos_prueba.Restaquince (40) > 35 );
	}
	private void realizaPruebaCierto() {
		assertTrue(Tipos_prueba.Sumacinco(10) > 14);
		assertTrue(Tipos_prueba.Sumacinco(5)  < 11);
		assertTrue(Tipos_prueba.Sumacinco(20) == 25);
		assertTrue(Tipos_prueba.Sumacinco(40) == 45);
		assertTrue(Tipos_prueba.Sumacinco(30) > 34);
		
		assertTrue(Tipos_prueba.divideDiez(10) < 10);
		assertTrue(Tipos_prueba.divideDiez(25) < 3 );
		assertTrue(Tipos_prueba.divideDiez(20) < 4);
		assertTrue(Tipos_prueba.divideDiez(40) < 5);
		assertTrue(Tipos_prueba.divideDiez(30) == 3);
		
		assertTrue(Tipos_prueba.Restaquince (20) == 5 );
		assertTrue(Tipos_prueba.Restaquince (30) > 10 );
		assertTrue(Tipos_prueba.Restaquince (100) < 95 );
		assertTrue(Tipos_prueba.Restaquince (50) < 40 );
		assertTrue(Tipos_prueba.Restaquince (40) > 20 );

	}
}
