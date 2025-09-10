package Lista02;

import java.util.Scanner;
public class Ex08_TrianguloValidoOuNao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("VALIDADE DE TRIÂNGULO");
        System.out.println(" ");

        int valor1;
        int valor2;
        int valor3;

        System.out.println("Para análise de validade, precisaremos que você insira" +
                " o valor das três arestas.");
        System.out.println(" ");

        System.out.print("VALOR 01: ");
        valor1 = input.nextInt();

        System.out.print("VALOR 02: ");
        valor2 = input.nextInt();

        System.out.print("VALOR 03: ");
        valor3 = input.nextInt();

        System.out.println(" ");

        // Verificação de desigualdade
        if (valor1 + valor2 > valor3 &&
                valor1 + valor3 > valor2 &&
                valor2 + valor3 > valor1) {
            System.out.println("Os valores FORMAM um TRIÂNGULO! ✅");}

        else {
            System.out.println("Os valores NÃO formam um triângulo. ❌");}

        System.out.println(" ");
    }
}
