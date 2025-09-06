import java.util.Scanner;

public class Ex03_ConversaoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CONVERSÃO DE IDADE EM MESES");

        int idade;

        System.out.print("Digite sua idade para ser" +
                " convertida em meses (apenas números): ");
        idade = input.nextInt();

        int conversao = idade * 12;

        System.out.print("A sua idade (" + idade + " anos) equivale a " +
                + conversao + " meses.");
    }
}