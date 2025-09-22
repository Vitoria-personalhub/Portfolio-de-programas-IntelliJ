package Lista02;

// Exxercício 03:
// Leia um número inteiro e diga se ele é par ou ímpar.

import java.util.Scanner;
public class Ex03_ParOuImpar {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PAR OU ÍMPAR");

        int numero;
        System.out.print("Informe um número para descobrir " +
                "se ele é par ou ímpar: ");
        numero = input.nextInt();

    //== (dois iguais) são equivalentes a uma comparação, enquanto = (um igual) é atribuição de valor a uma variável.
    // O símbolo de exclamação (!) é para indicar diferença. Exemplo: numero !=-2 | O número indcado pelo usuário é diferente de 2. 
    //Geralmente utilizado dentro de condicionais e é aplicável a esse caso.
        
        if (numero % 2 == 0) {
            System.out.print("O número informado é PAR. 2️⃣");}
        else {
            System.out.print("O número informado é ÍMPAR. 1️⃣");}
    }
}
