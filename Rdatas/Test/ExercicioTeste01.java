package DevDojoExercicios.Rdatas.Test;

import java.time.LocalDateTime;
import java.util.Locale;

public class ExercicioTeste01 {
    public static void main(String[] args) {
        cadastro();
    }

    public static void cadastro(){
        String nome = "Kayo";
        String cpf = "45742302827";
        System.out.println("Nome: "+nome + " CPF: " + cpf);
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Data do cadastro: " + time);
        Locale locale = new Locale("pt", "BR");
        System.out.println("Local de cadastro: " + locale.getDisplayCountry());
    }
}
