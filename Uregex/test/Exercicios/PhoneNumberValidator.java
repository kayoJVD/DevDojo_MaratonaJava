package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        String phone = "(11) 95426-0669";
        String regex = "^\\(\\d{2}\\) \\d{5}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        System.out.println("Número de telefone valido: " + matcher.matches());
    }
}
