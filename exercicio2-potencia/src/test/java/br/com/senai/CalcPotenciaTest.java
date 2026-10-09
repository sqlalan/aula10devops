package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    // Tolerância usada na comparação de valores double
    private static final double DELTA = 0.001;

    @Test
    void testarPotencia220V() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(220, 5);
        // 220 V x 5 A = 1100 W
        assertEquals(1100.0, potencia, DELTA);
    }

    @Test
    void testarPotencia127V() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(127, 10);
        // 127 V x 10 A = 1270 W
        assertEquals(1270.0, potencia, DELTA);
    }

    @Test
    void testarPotenciaCorrenteDecimal() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(12, 2.5);
        // 12 V x 2,5 A = 30 W
        assertEquals(30.0, potencia, DELTA);
    }

}
