package br.com.senai;

public class CalcIMC {

    // IMC = peso / (altura * altura)
    public double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero");
        }
        return peso / (altura * altura);
    }

}
