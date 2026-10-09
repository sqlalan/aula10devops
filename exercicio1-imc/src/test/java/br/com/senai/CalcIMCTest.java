package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    // Tolerância usada na comparação de valores double
    private static final double DELTA = 0.01;

    @Test
    void testarIMCPesoNormal() {
        CalcIMC calc = new CalcIMC();
        double imc = calc.calcularIMC(70, 1.75);
        // 70 / (1,75 * 1,75) = 22,857...
        assertEquals(22.86, imc, DELTA);
    }

    @Test
    void testarIMCExato() {
        CalcIMC calc = new CalcIMC();
        double imc = calc.calcularIMC(100, 2.0);
        // 100 / (2 * 2) = 25
        assertEquals(25.0, imc, DELTA);
    }

    @Test
    void testarAlturaInvalida() {
        CalcIMC calc = new CalcIMC();
        assertThrows(IllegalArgumentException.class, () -> calc.calcularIMC(70, 0));
    }

}
