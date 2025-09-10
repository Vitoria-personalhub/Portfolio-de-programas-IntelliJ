package Lista01;

import java.util.Scanner;

public class Ex06_SomaDiferencaProdutoQuociente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("CÁLCULOS ENTRE DOIS NÚMEROS");
        System.out.println(" ");

        double RealNum1;
        double RealNum2;

    System.out.print("Digite o primeiro número para cálculo: ");
    RealNum1 = input.nextDouble();

    System.out.print("Digite o segundo número para cálculo: ");
    RealNum2 = input.nextDouble();

    double soma = RealNum1 + RealNum2;
    double diferenca = RealNum1 - RealNum2;
    double produto = RealNum1 / RealNum2;
    double quociente = RealNum1 % RealNum2;

    System.out.print("A soma dos números é " + soma +
            ", a diferença é " + diferenca + ", o produto é "
            + produto + " e o quociente é " + quociente + ".");
    }
}
