package teste_unitarios.demo;

import org.junit.jupiter.api.Test;
import teste_unitarios.demo.test.OlderAge;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class isOlderThan18 {

    @Test
    void testIsOlderThan18(){
        OlderAge checker = new OlderAge();

        // Testando idade maior ou igual a 18 (deve retornar true)
        assertTrue(checker.isOlderThan18(18), "A idade de 18 deve ser considerada maior ou igual a 18");
        assertTrue(checker.isOlderThan18(20), "A idade de 20 deve ser considerada maior ou igual a 18");

        // Testando idade menor que 18 (deve retornar false)
        assertFalse(checker.isOlderThan18(17), "A idade de 17 deve ser considerada menor que 18");
        assertFalse(checker.isOlderThan18(0), "A idade de 0 deve ser considerada menor que 18");
    }
}
