package javacore.Bintroducaoclasses.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2){
        if (num2 ==0){
            System.out.println("Não existe divisão por zero!");
            return 0;
        }
        return num/num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num, double num2){
        if(num2 ==0){
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num/num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Número 1: "+ numero1);
        System.out.println("Número 2: "+ numero2);
    }
}
