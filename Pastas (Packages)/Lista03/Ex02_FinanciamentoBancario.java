package Lista03;

import java.util.Scanner;

public class Ex02_FinanciamentoBancario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("FINANCIAMENTO BANCÁRIO");

        double valormensal;

        System.out.print("Qual o valor da pretensão mensal que" +
                "você pretende pagar durante o financiamento? R$ ");
        valormensal = input.nextDouble();

        // Ela pode assumir a pretensão com segurança se:

        // O valor não ultrapassar 30% da sua renda mensal

        // Se a pretensão for maior que R$  3.000, exigir
        // que a renda mensal seja pelo menos R$ 10.000.
    }
}
