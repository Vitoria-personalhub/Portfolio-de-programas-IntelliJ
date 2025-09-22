package Lista02;

// Exxercício 03:
// Leia um número inteiro e diga se ele é par ou ímpar.

import java.util.Scanner;
public class Ex03_ParOuImpar {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PAR OU ÍMPAR");

        int numero;
        System.out.print("Informe um número para descobrir " +
                "se ele é par ou ímpar: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número informado é PAR. 2️⃣");}
        else {
            System.out.print("O número informado é ÍMPAR. 1️⃣");}
    }
}
