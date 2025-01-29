package com.entornos.segundoTrimestre.pruebas.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void testSuma() {
		Calculadora cal = new Calculadora();
		assertEquals(11, cal.suma(8, 3));
	}

	@Test
	void testResta() {
		Calculadora cal = new Calculadora();
		assertEquals(5, cal.resta(7, 2));
	}

	@Test
	void testMulti() {
		Calculadora cal = new Calculadora();
		assertEquals(12, cal.multi(4, 3));
	}

	@Test
	void testDivision() {
		Calculadora cal = new 
				Calculadora();
		assertEquals(2, cal.division(6,3));
	}
}