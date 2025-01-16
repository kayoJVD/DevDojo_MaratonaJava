package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoSenha {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@*#&]).{8,}$";
        String password = "Javateste@01";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.find());
    }
}
