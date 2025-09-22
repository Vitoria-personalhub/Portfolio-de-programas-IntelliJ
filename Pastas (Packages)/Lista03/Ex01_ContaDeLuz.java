package Lista03;

// Exercício 01:
//Faça um programa em Java que leia a quantidade de kWh consumidos por uma residência em um mês e calcule e mostre o
// valor da conta de energia elétrica, seguindo as regras:
//Até 100 kWh = R$ 0,50 por kWh
//De 101 até 200 kWh = R$ 0,70 por kWh
//Acima de 200 kWh = R$ 0,90 por kWh
//Regras adicionais:
//Se o consumo ultrapassar 500 kWh, mostrar também a mensagem “Consumo elevado: considere economizar energia”.
//Se o valor total da conta ultrapassar R$ 200,00, aplicar um desconto de 10%.
//Se o valor da conta for inferior a R$ 30,00, informar que o valor não será cobrado neste mês. Será somado à
//próxima conta.

import java.util.Scanner;
public class Ex01_ContaDeLuz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double energia; // kWh consumidos
        double valor;   // Valor inicial da conta
        double desconto; // Desconto de 10%
        double valorFinal; // Valor final da conta

        System.out.println("CÁLCULO DE CONTA DE LUZ");
        System.out.print("Insira a quantidade de energia consumida durante UM mês (kWh): ");
        energia = input.nextDouble();

        // Cálculo do valor base
        if (energia <= 100) {
            valor = energia * 0.50;}
        else if (energia <= 200) {
            valor = energia * 0.70;}
        else {
            valor = energia * 0.90;}
        valorFinal = valor;

        // Regras adicionais
        if (energia > 500) {
            System.out.println("Consumo elevado: considere economizar energia.");}
        if (valorFinal > 200) {
            desconto = valorFinal * 0.10;
            valorFinal -= desconto;
            System.out.println("Foi aplicado um desconto de 10%: -R$ " + desconto);}
        if (valorFinal < 30) {
            System.out.println("O valor da conta foi inferior a R$30. "
                    + "Nada será cobrado este mês e será somado à próxima conta.");}
        else {
            System.out.printf("Sua conta de luz é: R$ %.2f%n", valorFinal);}
    }
}
