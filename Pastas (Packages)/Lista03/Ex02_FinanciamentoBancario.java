package Lista03;

// Exercício 02:
// Faça um programa que leia:
// - O valor da renda mensal de uma pessoa.
// - O valor da prestação mensal que ela deseja pagar no financiamento.
// Verifique se ela pode assumir essa prestação com segurança, segundo esta regra:
// - O valor da prestação não pode ultrapassar 30% da sua renda mensal.
// - Se a prestação ultrapassar R$3.000,00, exigir que a renda mensal seja pelo menos R$10.000,00.
// Mostrar mensagens adequadas, por exemplo:
// “Financiamento aprovado”
// “Financiamento negado por alta prestação”
// “Financiamento negado por baixa renda”

import java.util.Scanner;

public class Ex02_FinanciamentoBancario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35mFINANCIAMENTO BANCÁRIO\u001B[0m");
        System.out.print("Qual é a sua \u001B[1mRENDA MENSAL\u001B[0m? R$ ");
        double rendamensal = input.nextDouble();

        System.out.print("Qual o valor da \u001B[1mPRESTAÇÃO MENSAL\u001B[0m que " +
                "você pretende pagar durante o financiamento? R$ ");
        double prestacaomensal = input.nextDouble();

        System.out.println(" ");
        // Ela pode assumir a pretensão com segurança se:
        // 1- O valor não ultrapassar 30% da sua renda mensal
        if (prestacaomensal > 3000 && rendamensal < 10000) {
            System.out.println("\u001B[1m\u001B[31mFinanciamento negado por baixa renda.\u001B[0m");

            // 2 - Se a prestação > R$3.000, exigir renda mensal ≧ R$10.000
        } else if (prestacaomensal > rendamensal * 0.3) {
            double valorpermitido = rendamensal * 0.3;
            System.out.printf("A prestação ultrapassa 30%% de sua renda mensal (Limite permitido: R$ %.2f)\n", valorpermitido);
            System.out.println("\u001B[1m\u001B[31mFinanciamento negado por alta prestação.\u001B[0m");
        } else {
            System.out.println("\u001B[1m\u001B[32mFinanciamento aprovado.\u001B[0m");
            System.out.println("O empréstimo poderá ser realizado com segurança.");
        }
    }
}
