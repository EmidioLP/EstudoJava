package javacore.Bintroducaoclasses.test;

import javacore.Bintroducaoclasses.dominio.Estudante;
import javacore.Bintroducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Renato";
        estudante01.idade = 28;
        estudante01.sexo='M';

        estudante02.nome = "Emidio";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
