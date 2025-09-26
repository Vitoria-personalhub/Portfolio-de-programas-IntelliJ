package Lista02;

/* Exercício 02:
 Leia a idade de uma pessoa e informe se ela é maior de idade
 (18 anos ou mais) ou menor de idade.
*/

import java.util.Scanner;
public class Ex02_Maioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MAIORIDADE");
        System.out.print("Por favor, informe sua idade " +
                "para que possamos verificar se você é " +
                "legalmente maior: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.print("Você é MAIOR de idade. ✅"); }
        else {
            System.out.print("Você é MENOR de idade. \uD83D\uDD1E"); }
    }
}
