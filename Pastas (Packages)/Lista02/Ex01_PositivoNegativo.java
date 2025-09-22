package Lista02;

// Exercicio 01:
// Escreva um programa que leia um número inteiro e diga se ele é
// positivo ou negativo.

import java.util.Scanner;
public class Ex01_PositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("01 - NÚMERO POSITIVO OU NEGATIVO");

        double numero;
        System.out.print("Informe um número para descobrir se ele" +
                " é positivo ou negativo: ");
        numero = input.nextDouble();

        if (numero < 0 ) {
            System.out.print("O número inserido é NEGATIVO."); }

        else if (numero > 0 ) {
            System.out.print("O número inserido é POSITIVO."); }

        else {
            System.out.println("O número inserido é INVÁLIDO."); }

    }
}
