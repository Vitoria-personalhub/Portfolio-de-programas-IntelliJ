package Lista01;

/* Exercício 04:
 Peça ao usuário o valor de um produto e mostre o preço com 10%
 de desconto.
*/

import java.util.Scanner;
public class Ex04_Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CÁLCULO DE DESCONTO DE 10%");
        System.out.print("Digite o valor do produto: R$ ");
        double valor = input.nextDouble();

        double desconto = valor * 0.10; // 10% do valor
        double valorComDesconto = valor - desconto;

        System.out.printf("O valor original: R$ %.2f\n", valor);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);
    }
}
