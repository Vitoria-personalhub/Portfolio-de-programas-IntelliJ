package Lista02;

import java.util.Scanner;
public class Ex05_AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("APROVADO OU REPROVADO");
        System.out.println(" ");

        double nota;

        System.out.print("Informe a sua nota (0-10) para saber sua situação: ");
        nota = input.nextDouble();

        if (nota >=7) {
            System.out.print("Você foi APROVADO! \uD83E\uDD73");}

        else if (nota >= 4) {
            System.out.print("Você está de RECUPERAÇÃO. ❌"); }

        else {
            System.out.print("Você foi REPROVADO. \uD83D\uDC4E"); }

        System.out.println(" ");
    }
}
