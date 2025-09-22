package Lista01;

// Exercício 04:
// Peça ao usuário o valor de um produto e mostre o preço com 10%
// de desconto.

import java.util.Scanner;
public class Ex04_Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;

        System.out.println("DOBRO DE UM NÚMERO");
        System.out.print("Digite o numero que quer descobrir o dobro" +
                ", decimal ou inteiro: ");
        num = input.nextDouble();

        double dobro = num * 2;
        System.out.print("O dobro do número " + num + " é " + dobro + ".");
    }
}