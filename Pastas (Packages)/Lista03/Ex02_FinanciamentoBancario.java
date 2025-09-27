package Lista03;

/* Exercício 02:
 Faça um programa que leia:
 - O valor da renda mensal de uma pessoa.
 - O valor da prestação mensal que ela deseja pagar no financiamento.
 Verifique se ela pode assumir essa prestação com segurança, segundo esta regra:
 - O valor da prestação não pode ultrapassar 30% da sua renda mensal.
 - Se a prestação ultrapassar R$3.000,00, exigir que a renda mensal seja pelo menos R$10.000,00.
 Mostrar mensagens adequadas, por exemplo:
 “Financiamento aprovado”
 “Financiamento negado por alta prestação”
 “Financiamento negado por baixa renda”
*/

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

        // Lógica de verificação de elegibilidade para o financiamento
        boolean financiamentoAprovado = true;
        String motivoNegacao = "";

        // Regra 2: Se a prestação > R$3.000, exige renda mensal ≥ R$10.000
        if (prestacaomensal > 3000 && rendamensal < 10000) {
            financiamentoAprovado = false;
            motivoNegacao = "\u001B[1m\u001B[31mFinanciamento negado por baixa renda (prestação" +
                    " > R$3.000 exige renda >= R$10.000).\u001B[0m";
        }
        // Regra 1: A prestação não pode ultrapassar 30% da renda mensal
        // Este 'else if' garante que esta condição só será verificada se a primeira (da prestação > 3000)
        // não for a razão da negação
        else if (prestacaomensal > rendamensal * 0.3) {
            financiamentoAprovado = false;
            double limitePrestacaoPermitido = rendamensal * 0.3;
            motivoNegacao = String.format("A prestação ultrapassa 30%% de sua renda mensal " +
                    "(Limite permitido: R$ %.2f)\n", limitePrestacaoPermitido) +
                    "\u001B[1m\u001B[31mFinanciamento negado por alta prestação.\u001B[0m";
        }

        if (financiamentoAprovado) {
            System.out.println("\u001B[1m\u001B[32mFinanciamento aprovado.\u001B[0m");
            System.out.println("O empréstimo poderá ser realizado com segurança.");
        } else {
            System.out.println(motivoNegacao);
        }

        input.close(); // Fechar o scanner
    }
}