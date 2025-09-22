package Lista02;

// Exercício 10:
// Crie um programa em Java que simule um sistema de login simples com permissões de acesso.
// O programa deve:
// - Pedir ao usuário um nome de usuário e uma senha.
// - Verificar se o nome de usuário e a senha estão corretos:
// Usuário: "admin" /Senha: "1234" = acesso total (mostrar: "Bem-vindo, administrador!").
// Usuário: "aluno" /Senha: "0000" = acesso restrito (mostrar: "Bem-vindo, aluno. Você pode consultar suas notas.").
// Usuário: "professor" /Senha: "4321" = acesso parcial (mostrar: "Bem-vindo, professor. Você pode lançar notas.").
// Observaçõs: Se o usuário existir, mas a senha estiver incorreta, mostrar "Senha incorreta".
// Se o usuário não existir = mostrar "Usuário não encontrado".
// Se o login falhar 3 vezes seguidas, o programa deve mostrar:
// "Acesso bloqueado. Tente novamente mais tarde." e encerra.

import java.util.Scanner;
public class Ex10_SistemaDeLoginEPermissoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEMA DE LOGIN E PERMISSÕES");

        int tentativas = 0;
        boolean acessoConcedido = false;

        while (tentativas < 3 && !acessoConcedido) {
            System.out.print("\nNOME DE USUÁRIO: ");
            String usuario = input.next();
            System.out.print("SENHA: ");
            String senha = input.next(); // senha como String
            System.out.println();

            if (usuario.equals("admin")) {
                if (senha.equals("1234")) {
                    System.out.println("[ACESSO TOTAL]");
                    System.out.println("Bem-vindo, administrador! 👑");
                    acessoConcedido = true;
                } else {
                    System.out.println("Senha incorreta ❌");}
            } else if (usuario.equals("aluno")) {
                if (senha.equals("0000")) {
                    System.out.println("[ACESSO RESTRITO]");
                    System.out.println("Bem-vindo, aluno! 🎓");
                    System.out.println("Você pode consultar suas notas.");
                    acessoConcedido = true;}
                else {
                    System.out.println("Senha incorreta ❌");}
            } else if (usuario.equals("professor")) {
                if (senha.equals("4321")) {
                    System.out.println("[ACESSO PARCIAL]");
                    System.out.println("Bem-vindo, professor! 👨‍🏫");
                    System.out.println("Você pode lançar notas.");
                    acessoConcedido = true;}
                else {
                    System.out.println("Senha incorreta ❌");}
            }
            else {
                System.out.println("Usuário não encontrado ❌");}
            tentativas++;}
        if (!acessoConcedido) {
            System.out.println("\u001B[1m\u001B[31mAcesso bloqueado. Tente novamente mais tarde.\u001B[0m");}
    }
}
