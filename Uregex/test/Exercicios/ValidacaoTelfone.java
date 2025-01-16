package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoTelfone {
    public static void main(String[] args) {
        String regex = "^\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}$";
        String phoneNumber = "(11)95426-0669";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        System.out.println(matcher.matches());
        while (matcher.find()){
            System.out.println(matcher.matches() + matcher.group());
        }
    }
}
