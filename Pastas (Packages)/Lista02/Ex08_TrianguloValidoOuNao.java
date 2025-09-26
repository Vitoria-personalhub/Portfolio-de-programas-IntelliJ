package Lista02;

/* Exercício 08:
 Leia três valores e verifique se eles podem formar um triângulo.
 Condição: cada lado deve ser menor que a soma dos outros dois.
*/

import java.util.Scanner;
public class Ex08_TrianguloValidoOuNao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("VALIDADE DE TRIÂNGULO");
        System.out.println("Para análise de validade, precisaremos que você insira o valor das três arestas.");

        System.out.println(); // quebra de linha

        System.out.print("VALOR 01: ");
        int valor1 = input.nextInt();
        System.out.print("VALOR 02: ");
        int valor2 = input.nextInt();
        System.out.print("VALOR 03: ");
        int valor3 = input.nextInt();
        System.out.println(" ");

        // Verificação de desigualdade
        if (valor1 + valor2 > valor3 &&
                valor1 + valor3 > valor2 &&
                valor2 + valor3 > valor1) {
            System.out.println("Os valores FORMAM um TRIÂNGULO! ✅");}
        else {
            System.out.println("Os valores NÃO formam um triângulo. ❌");}
    }
}
