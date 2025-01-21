package teste_unitarios.demo;

import org.junit.jupiter.api.Test;
import teste_unitarios.demo.test.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){
       // instância da classe calculator
        calculator calc = new calculator();

        // Testando o método add
        int result = calc.add(2,3);
        assertEquals(5, result, "A soma de 2 e 3 deve ser 5");

    }

    @Test
    void testSubtract(){
        //instância da classe calculator
        calculator calc = new calculator();

        // Testando o método subtract
        int result = calc.subtract(5,3);
        assertEquals(2, result, "A subtração de 5 e 3 deve ser 2");
    }
}
