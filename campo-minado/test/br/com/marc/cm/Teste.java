package br.com.marc.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarVariavel() {
		
		int a = 1 + 2;
 		
		assertEquals(3, a);
	}
	
	@Test
	void testarVariavel2() {
		
		int b = 1 + 2 + 8 * 5;
 		
		assertEquals(43, b);
	}

}
