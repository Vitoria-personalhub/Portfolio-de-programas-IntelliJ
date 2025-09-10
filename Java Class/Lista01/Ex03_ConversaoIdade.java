package Lista01;

import java.util.Scanner;

public class Ex03_ConversaoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("CONVERSÃO DE IDADE EM MESES");
        System.out.println(" ");

        int idade;

        System.out.print("Digite sua idade para ser" +
                " convertida em meses (apenas números): ");
        idade = input.nextInt();

        int conversao = idade * 12;

        System.out.print("A sua idade (" + idade + " anos) equivale a " +
                + conversao + " meses.");
    }
}