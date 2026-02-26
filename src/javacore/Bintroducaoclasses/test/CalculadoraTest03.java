package javacore.Bintroducaoclasses.test;

import javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
        System.out.println("------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
    }
}
