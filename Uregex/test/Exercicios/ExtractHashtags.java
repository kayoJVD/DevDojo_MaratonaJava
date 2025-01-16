package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Extrair hashtags de um texto
public class ExtractHashtags {
    public static void main(String[] args) {
        String text = "Amo #progração e #java!";
        String regex = "#\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Hastag encontrada: " + matcher.group());
        }
    }
}
