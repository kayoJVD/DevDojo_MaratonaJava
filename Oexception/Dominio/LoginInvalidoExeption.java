package DevDojoExercicios.Oexception.Dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        System.out.println("Login Invalido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
