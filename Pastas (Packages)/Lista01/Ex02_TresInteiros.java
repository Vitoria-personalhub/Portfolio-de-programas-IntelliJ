package Lista01;

/* Exercício 02:
 Peça ao usuário para digitar três números inteiros.
 Em seguida, calcule e mostre:
 - A soma dos três números
 - A média aritmética entre eles
*/

import java.util.Scanner;
public class Ex02_TresInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MEDIA ARITMÉTICA - 3 NÚMEROS INTEIROS");
        System.out.print("Digite o primeiro número inteiro: ");
        int NumUm = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int NumDois = input.nextInt();
        System.out.print("Digite o segundo terceiro inteiro: ");
        int NumTres = input.nextInt();

        int media = (NumUm + NumDois + NumTres)/3;
        System.out.print("A média aritmética dos números ("
                + NumUm + ", " + NumDois + ", " + NumTres +
                ") é " + media +"." + "\n");
    }
}