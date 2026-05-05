package tests;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import negocio.Parcial;

import org.junit.jupiter.api.Test;


class Tests {
	
	private final Parcial calculadora = new Parcial();
	
	@Test
	
	}
	
}



import example.util.Calculator;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

	private final Calculator calculator = new Calculator();

	@Test
	void addition() {
		assertEquals(2, calculator.add(1, 1));
	}

}