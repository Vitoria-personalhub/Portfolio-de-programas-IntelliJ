package Lista02;

import java.util.Scanner;
public class Ex10_SistemaDeLoginEPermissoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("SISTEMA DE LOGIN E PERMISSÕES");
        System.out.println(" ");

        String NomeDeUsuario;
        int Senha;

        //Login
        System.out.print("NOME DE USUÁRIO: ");
        NomeDeUsuario = input.next();
        System.out.print("SENHA: ");
        Senha = input.nextInt();
        System.out.println(" ");

        //Listagem de usuários existentes
        boolean usuarioExiste = NomeDeUsuario.equals("admin") ||
                                NomeDeUsuario.equals("aluno") ||
                                NomeDeUsuario.equals("professor");

        //Administrador
        if (NomeDeUsuario.equals("admin")) {
            if (Senha == 1234) {
                System.out.print("""
                        [ACESSO TOTAL]
                        
                        Bem-vindo, administrador! 👑""");}
            else {
                System.out.println("Senha incorreta para o usuário admin! ❌");
            }
        }

        //Aluno
        else if (NomeDeUsuario.equals("aluno")) {
            if (Senha == 0000) {
                System.out.print("""
                        [ACESSO RESTRITO]
                        
                        Bem-vindo, aluno! 🎓
                        Você pode consultar suas notas.""");
            } else {
                System.out.println("Senha incorreta para o usuário aluno! ❌");

            }
        }

        //Professor
        else if (NomeDeUsuario.equals("professor")) {
                 if (Senha == 4321) {
            System.out.print("""
                    [ACESSO PARCIAL]
                    
                    Bem-vindo, professor! 👨‍🏫
                    Você pode lançar notas.""");}
                 else {
                     System.out.println("Senha incorreta para o usuário professor! ❌");
                 }
            }

        //usuário existir mas a senha estiver incorreta

        //usuário não existir
        else {
            System.out.println("Usuário ou senha incorretos! ❌");}

        System.out.println(" ");
    }
}
