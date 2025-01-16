package DevDojoExercicios.Oexception.Exception;

import DevDojoExercicios.Oexception.Dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
       try {
           logar();
       }catch (LoginInvalidoExeption e){
           e.printStackTrace();
       }

    }
    private static void logar() throws LoginInvalidoExeption{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoExeption("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
