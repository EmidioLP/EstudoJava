package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.nome = "Volkswagen";
        carro01.modelo = "T-Cross";
        carro01.ano = 2026;

        Carro carro02 = new Carro();
        carro02.nome = "Volkswagen";
        carro02.modelo = "Taos";
        carro02.ano = 2026;

        System.out.println("Nome: " + carro01.nome + "\nModelo: " + carro01.modelo + "\nAno: " + carro01.ano);
        System.out.println("*******************************************************************************");
        System.out.println("Nome: " + carro02.nome + "\nModelo: " + carro02.modelo + "\nAno: " + carro02.ano);
    }
}
