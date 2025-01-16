package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Encontrar números em uma string
public class FindNumbers {
    public static void main(String[] args) {
        String input = "A sala 101 é mais espaçosa que a sala 102";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Numero encontrado: " + matcher.group());
        }
    }
}
