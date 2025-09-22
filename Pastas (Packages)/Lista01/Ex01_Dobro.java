package Lista01;

// Exercício 01:
// Peça ao usuário para digitar um número real (que pode ter
// casas decimais) e calcule o seu dobro. Mostre o resultado.

import java.util.Scanner;
public class Ex01_Dobro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DOBRO DE UM NÚMERO");
        System.out.print("Digite o numero que quer descobrir o dobro" +
                ", decimal ou inteiro: ");
        double num = input.nextDouble();

        double dobro = num * 2;
        System.out.print("O dobro do número " + num + " é " + dobro + ".");
    }
}