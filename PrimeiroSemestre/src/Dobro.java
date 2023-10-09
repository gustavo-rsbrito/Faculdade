import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {

        /*Implemente um programa em Java que a partir de um número informado pelo usuário,
         calcule seu dobro e apresente ao usuário.*/


        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        double numero = ler.nextDouble();

        double dobro = numero * 2;

        System.out.println("O Dobro de " +  numero + " é " + dobro);

    }
}
