package javacore.Bintroducaoclasses.test;

import javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Número 1: " + num);
        System.out.println("Número 2: "+ num2);
    }
}
