package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Encontrar palavras que começam com uma vogal
public class WordsStartingWithVowel {
    public static void main(String[] args) {
        String text = "A rapida raposa saltou sobre o cachorro.";
        String regex = "\\b[aeiouAEIOU]\\w*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Palavra encontrada: " + matcher.group());
        }
    }
}
