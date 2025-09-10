package Lista02;

import java.util.Scanner;
public class Ex04_MaiorDeDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("COMPARAÇÃO ENTRE NÚMEROS");
        System.out.println(" ");

        int numero1;
        int numero2;

        System.out.print("Informe o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = input.nextInt();

        System.out.println(" ");

        if (numero1 > numero2) {
            System.out.print("O primeiro número (" +  numero1 +
                    ") é MAIOR do que o segundo: (" +  numero2
                    + ").");}

        else if (numero2 > numero1) {
            System.out.print("O segundo número (" +  numero2 +
                    ") é MAIOR do que o primeiro" +
                    " (" +  numero1 + ").");}

        else {
            System.out.print("Os valores são IGUAIS.");}

        System.out.println(" ");

    }
}
