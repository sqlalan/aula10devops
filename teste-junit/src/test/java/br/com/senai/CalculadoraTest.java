package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Anotação para dizer que a função é de teste
    @Test
    void testarSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);
        // metodo assertEquals compara o resultado que esperamos com o resultado real
        assertEquals(5, resultado);
    }

    // Função para testar a multiplicacao
    @Test
    void testarMult() {
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacao(3, 2);
        assertEquals(6, res);
    }

}
