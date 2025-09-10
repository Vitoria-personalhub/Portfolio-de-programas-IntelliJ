package Lista02;

import java.util.Scanner;
public class Ex02_Maioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("MAIORIDADE");
        System.out.println(" ");

        int idade;

        System.out.print("Por favor, informe sua idade " +
                "para que possamos verificar se você é " +
                "legalmente maior: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.print("Você é MAIOR de idade. ✅"); }

        else {
            System.out.print("Você é MENOR de idade. \uD83D\uDD1E"); }

        System.out.println(" ");
    }
}
