package Lista02;

import java.util.Scanner;
public class Ex03_ParOuImpar {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("PAR OU ÍMPAR");
        System.out.println(" ");

        int numero;

        System.out.print("Informe um número para descobrir " +
                "se ele é par ou ímpar: ");
        numero = input.nextInt();

    //== (dois iguais) são equivalentes a uma comparação, enquanto = (um igual) é atribuição de valor a uma variável.
        if (numero % 2 == 0) {
            System.out.print("O número informado é PAR. 2️⃣");}

        else {
            System.out.print("O número informado é ÍMPAR. 1️⃣");}

        System.out.println(" ");
    }
}
