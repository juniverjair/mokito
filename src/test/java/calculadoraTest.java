

import static org.junit.Assert.*;


import org.junit.Test;

public class calculadoraTest {

	
	@Test
	public void test1() {
		calculador c = new calculador();
		
	    try {
	    	int resultadoReal = c.sumar(2, 3);
		    int resultadoEsperado = 5;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}
	
	@Test
	public void test2() {
		calculador c = new calculador();
		
	    try {
	    	int resultadoReal = c.dividir(15, 5);
		    int resultadoEsperado = 3;
	    	assertEquals(resultadoEsperado, resultadoReal);
	    } catch (Exception e) {
	    	fail("Excepcion");
	    }
	}

}
