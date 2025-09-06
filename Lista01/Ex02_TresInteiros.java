import java.util.Scanner;

public class Ex02_TresInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NumUm;
        int NumDois;
        int NumTres;

        System.out.println("MEDIA ARITMÉTICA - 3 NÚMEROS INTEIROS");

        System.out.print("Digite o primeiro número inteiro: ");
        NumUm = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        NumDois = input.nextInt();

        System.out.print("Digite o segundo terceiro inteiro: ");
        NumTres = input.nextInt();

        int media = (NumUm + NumDois + NumTres)/3;

        System.out.print("A média aritmética dos números ("
                + NumUm + ", " + NumDois + ", " + NumTres +
                ") é " + media +"." + "\n");

    }
}