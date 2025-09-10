package Lista02;

import java.util.Scanner;
public class Ex09_MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("MAIOR DE TRÊS NÚMEROS");
        System.out.println(" ");

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();

        int maior = numero1; // o primeiro é o maior

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println(" ");
        System.out.println("O maior número é o: " + maior);

        System.out.println(" ");
    }
}
