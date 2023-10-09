import java.util.Scanner;

public class Triplo {

    public static void main(String[] args) {
        /*Implemente um programa em Java que a partir de um número informado pelo
        usuário, calcule seu triplo e apresente ao usuário.*/

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        double numero = ler.nextDouble();

        double triplo = numero * 3;

        System.out.println("O Triplo de " +  numero + " é " + triplo);
    }
}
