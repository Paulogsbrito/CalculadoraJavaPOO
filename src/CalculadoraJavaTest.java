import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculadoraJavaTest {

    private CalculadoraJAVA calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraJAVA();
    }

    @Test
    void testSomar() {
        double resultado = calculadora.somar(120, 8);
        assertEquals(128, resultado, 0.0001, "120 + 8 deveria ser 128");
    }

    @Test
    void testHistoricoSomar() {
        calculadora.somar(128, 8);
        List<String> historico = calculadora.getHistorico();

        assertEquals(1, historico.size(), "O historico deveria ter 1 operação");
        assertTrue(historico.contains("128.0 + 8.0 = 128"));

    }

}
