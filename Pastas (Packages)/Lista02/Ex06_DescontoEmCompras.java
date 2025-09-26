package Lista02;

/* Exercício 06: Leia o valor de uma compra.
 Se for maior ou igual a 100 reais, aplique 10% de desconto.
 Caso contrário, não aplique desconto. Mostre o valor final.
*/

import java.util.Scanner;
public class Ex06_DescontoEmCompras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DESCONTO EM COMPRAS");
        System.out.print("Insira o custo de sua compra: R$ ");
        double valor = input.nextDouble();

        System.out.println(); // quebra de linha

        if (valor >= 100) {
            double valorComDesconto = valor * 0.9; // aplica 10%
            System.out.println("Parabéns! 🎉 Você ganhou 10% de desconto.");
            System.out.printf("O valor com desconto aplicado é: R$ %.2f\n", valorComDesconto);
        } else {
            System.out.println("Desconto não aplicado.");
            System.out.println("O valor informado não atingiu o mínimo necessário para o desconto.");
            System.out.println("Fique de olho nas próximas oportunidades!");
        }
    }
}
