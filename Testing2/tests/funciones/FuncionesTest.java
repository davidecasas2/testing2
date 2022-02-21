package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTest {



	private static Funciones funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones = new Funciones();
		System.out.println("Empezando tests...");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Ejecutando test");
	}

	@Test
	void diaSemanaTest() {
		assertEquals("Domingo", funciones.diaSemana(1));
		assertEquals("Lunes", funciones.diaSemana(2));
		assertEquals("Martes", funciones.diaSemana(3));
		assertEquals("Miercoles", funciones.diaSemana(4));
		assertEquals("Jueves", funciones.diaSemana(5));
		assertEquals("Viernes", funciones.diaSemana(6));
		assertEquals("Sabado", funciones.diaSemana(7));
		assertThrows(Exception.class, ()->funciones.diaSemana(9));
	}
	
	@Test
	void getDiasMesTest() {
		assertEquals(31, funciones.getDiasMes("enero", false));
		assertEquals(28, funciones.getDiasMes("febrero", false));
		assertEquals(29, funciones.getDiasMes("febrero", true));
		assertEquals(31, funciones.getDiasMes("marzo", false));
		assertEquals(30, funciones.getDiasMes("abril", false));
		assertEquals(31, funciones.getDiasMes("MAYO", false));
		assertEquals(30, funciones.getDiasMes("junio", false));
		assertEquals(31, funciones.getDiasMes("julio", false));
		assertEquals(31, funciones.getDiasMes("agosto", false));
		assertEquals(30, funciones.getDiasMes("septiembre", false));
		assertEquals(31, funciones.getDiasMes("octubre", false));
		assertEquals(30, funciones.getDiasMes("noviembre", false));
		assertEquals(31, funciones.getDiasMes("diciembre", false));
	}

	@Test 
	void devuelveParesACeroTest () {
		int v[] = { 2,3,1,4,7 };
		int solucion [] = { 0,3,1,0,7};
		assertArrayEquals(solucion, funciones.devuelveParesACero(v));
		
		int v2[] = { 1,2,3,0,4,5};
		int solucion2[] = {1,0,3,0,0,5};
		assertArrayEquals(solucion2, funciones.devuelveParesACero(v2));
	}
	
	
	@Test
	void esTriangSup( ) {
		int m [][] = { { 1, 2, 3},
				       { 0, 1, 2},
				       { 0, 0, 1}
		             };
		assertTrue(funciones.esTriangularSup(m));
		int m2 [][] = { { 1, 2, 3},
			            { 1, 1, 2},
			            { 0, 0, 1}
	                 };
		assertFalse(funciones.esTriangularSup(m2));
		
		}
}
