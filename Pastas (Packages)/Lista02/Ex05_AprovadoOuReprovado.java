package Lista02;

// Exercício 05:
// Leia a nota de um aluno (0 a 10) e diga se ele foi aprovado (nota >= 7),
// se está em recuperação (nota >= 4) ou reprovado.

import java.util.Scanner;
public class Ex05_AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("APROVADO OU REPROVADO");
        double nota;

        System.out.print("Informe a sua nota (0-10) para saber sua situação: ");
        nota = input.nextDouble();

        if (nota >=7) {
            System.out.print("Você foi APROVADO! \uD83E\uDD73");}
        else if (nota >= 4) {
            System.out.print("Você está de RECUPERAÇÃO. ❌"); }
        else {
            System.out.print("Você foi REPROVADO. \uD83D\uDC4E"); }
    }
}
