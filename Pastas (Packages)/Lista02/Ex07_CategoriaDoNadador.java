package Lista02;

// Exercício 07:
// Leia a idade de um nadador e classifique-o em uma categoria:
// - Infantil (até 12 anos)
// - Juvenil (13 a 17 anos)
// - Adulto (18 anos ou mais)

import java.util.Scanner;
public class Ex07_CategoriaDoNadador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("CATEGORIA DO NADADOR");
        System.out.println("Para saber em qual categoria você se encaixa," +
                " insira sua idade: ");
        System.out.print("➡ ");
        int idade = input.nextInt();
        System.out.println(" ");

    //Categorias
        if (idade <= 12) {
            System.out.print("Você está na categoria INFANTIL. \uD83D\uDC76");}
        else if (idade <= 17) {
            System.out.print("Você está na categoria JUVENIL. \uD83D\uDC66");}
        else {
            System.out.print("Você está na categoria ADULTO. \uD83D\uDC71\u200D♂️");}
    }
}
