package Lista02;

// Exercício 09:
// Leia três números inteiros e mostre qual deles é o maior.

import java.util.Scanner;
public class Ex09_MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MAIOR DE TRÊS NÚMEROS");
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = input.nextInt();

        int maior = numero1; // o primeiro é o maior
        if (numero2 > maior) {
            maior = numero2;}
        if (numero3 > maior) {
            maior = numero3;}

        System.out.println(" ");
        System.out.println("O maior número é o: " + maior);
    }
}
