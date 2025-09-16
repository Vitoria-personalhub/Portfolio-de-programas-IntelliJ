package Lista02;

import java.util.Scanner;

public class Main {
    public static void Ex010_SistemaDeLoginEPermissoes(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("SISTEMA DE LOGIN E PERMISSÕES");
        System.out.println(" ");

        String NomeDeUsuario;
        int Senha;
        int tentativas = 0;
        boolean acessoConcedido = false;

        //Login
        while (tentativas < 3 && !acessoConcedido) {
            System.out.print("NOME DE USUÁRIO: ");
            NomeDeUsuario = input.next();
            System.out.print("SENHA: ");
            Senha = input.nextInt();
            System.out.println(" ");

            //Verificação de usuários existentes
            boolean usuarioExiste = NomeDeUsuario.equals("admin") ||
                    NomeDeUsuario.equals("aluno") ||
                    NomeDeUsuario.equals("professor");

            //Administrador
            if (NomeDeUsuario.equals("admin")) {
                if (Senha == 1234) {
                    System.out.print("""
                            [ACESSO TOTAL]
                            
                            Bem-vindo, administrador! 👑""");
                    acessoConcedido = true;
                } else {
                    System.out.println("Senha incorreta para o usuário admin! ❌");
                }

            //Aluno
            } else if (NomeDeUsuario.equals("aluno")) {
                if (Senha == 0) { // Melhor utilizar 0 ao invés de 0000
                    System.out.print("""
                        [ACESSO RESTRITO]
                        
                        Bem-vindo, aluno! 🎓
                        Você pode consultar suas notas.""");
                    acessoConcedido = true;
                } else {
                    System.out.println("Senha incorreta para o usuário aluno! ❌");
                }

            //Professor
            } else if (NomeDeUsuario.equals("professor")) {
                if (Senha == 4321) {
                    System.out.print("""
                            [ACESSO PARCIAL]
                            
                            Bem-vindo, professor! 👨‍🏫
                            Você pode lançar notas.""");
                    acessoConcedido = true;
                } else {
                    System.out.println("Senha incorreta para o usuário professor! ❌");
                }

            //Usuário não encontrado
            } else {
                System.out.println("Usuário não encontrado! ❌");
            }

            //Incrementando tentativas
            tentativas++;

            System.out.println(" ");
        }

        //Usuário falhou nas 3 tentativas
        if (!acessoConcedido) {
            System.out.println("VOCÊ EXCEDEU O NÚMERO DE TENTATIVAS! ❌");
        }
    }
}
