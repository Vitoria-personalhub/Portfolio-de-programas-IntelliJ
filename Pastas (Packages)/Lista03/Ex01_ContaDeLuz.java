package Lista03;

/* Exercício 01:
 Faça um programa em Java que leia a quantidade de kWh consumidos por uma residência em um mês e calcule e mostre o
 valor da conta de energia elétrica, seguindo as regras:
 - Até 100 kWh = R$0,50 por kWh
 - De 101 até 200 kWh = R$0,70 por kWh
 - Acima de 200 kWh = R$0,90 por kWh
Regras adicionais:
 - Se o consumo ultrapassar 500 kWh, mostrar também a mensagem “Consumo elevado: considere economizar energia”.
 - Se o valor total da conta ultrapassar R$200,00, aplicar um desconto de 10%.
 - Se o valor da conta for inferior a R$30,00, informar que o valor não será cobrado neste mês. Será somado à
 próxima conta.
    */

import java.util.Scanner;

public class Ex01_ContaDeLuz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35mCÁLCULO DE CONTA DE LUZ\u001B[0m");
        System.out.print("Insira a quantidade de energia consumida durante UM mês (kWh): ");
        double energia = input.nextDouble();

        double valor;

        // Cálculo do valor base usando if-else if para intervalos, que é a forma mais clara
        if (energia <= 100) {
            valor = energia * 0.50;
        } else if (energia <= 200) { // Implica automaticamente que energia > 100
            valor = energia * 0.70;
        } else { // Implica automaticamente que energia > 200
            valor = energia * 0.90;
        }

        System.out.println(); // Quebra de linha

        // Mensagem de consumo elevado
        if (energia > 500) {
            System.out.println("\u001B[33mConsumo elevado: considere economizar energia.\u001B[0m");
        }

        // Aplicação de desconto
        if (valor > 200) {
            double desconto = valor * 0.10;
            valor -= desconto;
            System.out.printf("\u001B[32mFoi aplicado um desconto de 10%%: -R$ %.2f\u001B[0m%n", desconto);
        }

        // Verificação de conta muito baixa
        if (valor < 30) {
            System.out.println("\u001B[31mO valor da conta foi inferior a R$30. Nada será cobrado este mês e será somado à próxima conta.\u001B[0m");
        } else {
            // Exibição da conta normal
            System.out.printf("\u001B[36mSua conta de luz é: R$ %.2f\u001B[0m%n", valor);
        }

        input.close(); // Fechar o scanner
    }
}