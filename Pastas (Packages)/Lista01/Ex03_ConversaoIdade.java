package Lista01;

/* Exercício 03:
 Peça ao usuário para digitar a sua idade em anos e depois converta essa
 idade para meses (1 ano = 12 meses). Mostre o resultado.
*/

import java.util.Scanner;
public class Ex03_ConversaoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CONVERSÃO DE IDADE EM MESES");
        System.out.print("Digite sua idade para ser" +
                " convertida em meses (apenas números): ");
        int idade = input.nextInt();

        int conversao = idade * 12;
        System.out.print("A sua idade (" + idade + " anos) equivale a " +
                + conversao + " meses.");
    }
}