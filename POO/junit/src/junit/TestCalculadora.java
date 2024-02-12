package junit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.IllegalArgumentException;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


class TestCalculadora {
	Calculadora m;
	
	@BeforeEach
	void init() {
		m=new Calculadora();
		
	}
	
	@Test
    void testSumar() {
		 double resultado = m.sumar(3, 1);
	     Assertions.assertEquals(3+1, resultado);
    }
	
	@DisplayName("Probando el cálculo del valor absoluto")
    @ParameterizedTest
    @ValueSource(ints={-1,2,4})
    void testAbsolutoConParametros(int num) {
	
        double resultado = m.absoluto(num);
        Assertions.assertEquals(Math.abs(num), resultado);
       

    }

    
}
