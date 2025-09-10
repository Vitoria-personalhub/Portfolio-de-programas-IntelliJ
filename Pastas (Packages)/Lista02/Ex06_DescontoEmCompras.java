package Lista02;

import java.util.Scanner;
public class Ex06_DescontoEmCompras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("DESCONTO EM COMPRAS");
        System.out.println(" ");

        double valor;
        double desconto;

        System.out.print("Insira o custo de sua compra para saber o " +
                "cálculo do valor total:" + "\n");
        System.out.print("R$ ");

        valor = input.nextDouble();
        desconto = (valor * 0.9);

        System.out.println(" ");
        if (valor >= 100) {
            System.out.print("Parabéns! 🎉" + "\n" +
                    "Você ganhou 10% de desconto sobre o valor de sua compra." + "\n" +
                    "O valor com desconto aplicado é R$" + desconto + ".");}

        else {
            System.out.print("""
                    Desconto não aplicado.
                    O valor informado não atingiu o mínimo necessário para o desconto.
                    Fique de olho nas próximas oportunidades!""");}

        System.out.println(" ");
    }
}
