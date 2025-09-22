package Lista01;

// Exercício 05:
// Peça ao usuário sua altura (em metros) e seu peso (em kg).
// Calcule o IMC (peso / altura²) e mostre o valor calculado.

import java.util.Scanner;
public class Ex05_IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMC");
        double altura;
        double peso;

        System.out.print("Para calcular seu IMC, informe sua altura(em metros): ");
        altura = input.nextDouble();
        System.out.print("Agora, informe o seu peso(em quilogramas): ");
        peso = input.nextDouble();

        double IMC = peso / Math.pow(altura, 2);
        System.out.println("Seu IMC é = " + IMC);

        if (IMC < 18.5) {
            System.out.print("Você está abaixo do peso.");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.print("Você está no peso ideal.");
        } else if (IMC >= 25.0 && IMC <= 30.0) {
            System.out.print("Você está com sobrepeso.");
        } else if (IMC >= 30 && IMC <= 39.9) {
            System.out.print("Você está com obesidade.");
        } else if (IMC > 40.0) {
            System.out.print("Você está com obesidade mórbida.");
        }
    }
}