/**
 * 
 */
package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author dw1a
 *
 */
class NumerosAmigosTest {

	
	@Test
	void testAmigoMal() {
		NumerosAmigos numerosMal = new NumerosAmigos(260,284); 
		boolean resultado = numerosMal.amigo();
		assertFalse(numerosMal,resultado);
	}
	
	@Test
	void testAmigoPerfecto() {
		NumerosAmigos numPerf = new NumerosAmigos(220, 284); 
		boolean resultado = numPerf.amigo();
		assertTrue(resultado,numPerf);
	}
	
	void testEsCeroN1() {
		int num= 0;
		int resultado = num;
		assertNull(resultado,num);
	}
	
	void testN1yN2SonIguales() {
		NumerosAmigos numPerf = new NumerosAmigos(2, 1); 
		int resultado = numPerf.esN1IgualAN2();
		assertEquals(resultado,numPerf);
	}

	void testN1yN2NoSonIguales() {
		NumerosAmigos numPerf = new NumerosAmigos(2, 1); 
		int resultado = numPerf.esN1IgualAN2();
		assertNotEquals(resultado,numPerf);
	}

}
