package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphanumericValidator {
    public static void main(String[] args) {
        String input = "abc123";
        String regex ="^[a-zA-z0-9]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Alfabeto alfanúmerico: " + matcher.matches());
    }
}
