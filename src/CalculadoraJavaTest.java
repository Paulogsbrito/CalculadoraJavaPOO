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
        assertTrue(historico.contains("128.0 + 8.0 = 136"));

    }

    @Test
    void testSubtrair(){
        double resultado = calculadora.subtrair(128, 8);
        assertEquals(120,resultado,0.0001, "128 - 8 deveria ser 120");

    }

    @Test
    void testHistoricoSubtrair(){
        calculadora.subtrair(128,8);
        List<String> historico = calculadora.getHistorico();

        assertEquals(1, historico.size(),"O historico deveria ter 1 operação");
        assertTrue(historico.contains("128.0 - 8.0 = 120"));


    }

    @Test
    void testMultiplicar(){
        double resultado = calculadora.multiplicar(128,2);
        assertEquals(256,resultado,0.0001, "128 * 2 deveria ser 256");

    }



    @Test
    void testHistoricoMultiplicar(){

        calculadora.multiplicar(128,2);
        List<String> historico = calculadora.getHistorico();

        assertEquals(1, historico.size(), "O historico deveria ter 1 operação");
        assertTrue(historico.contains("128 * 2 = 256"));

    }

    @Test
    void testDividir(){
        double resultado = calculadora.dividir(128,2);
        assertEquals(64,resultado,0.0001,"128 / 2 deveria ser 64");

    }

    @Test
    void testHistoricoDividir(){

        calculadora.dividir(128,2);
        List<String> historico = calculadora.getHistorico();

        assertEquals(1, historico.size(), "O historico deveria ter 1 operação");
        assertTrue(historico.contains("128 / 2 = 64"));
    }

    @Test
    void testDivisaoPorZero(){
        double resultado = calculadora.dividir(10,0);
        assertTrue(Double.isNaN(resultado), "Divisão por zero deve retornar NaN!!!");

        List<String> historico = calculadora.getHistorico();
        assertEquals(1, historico.size(),"O historico deve registrar erro de Divisão por Zero");
        assertTrue(historico.get(0).contains("Erro: Divisão por Zero não é permitida!!!"));
    }



}
