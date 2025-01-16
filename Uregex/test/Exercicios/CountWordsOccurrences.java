package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Contar quantas vezes uma palavra aparece em um texto
public class CountWordsOccurrences {
    public static void main(String[] args) {
        String text = "java é uma linguagem de programação java é popular";
        String word = "java";
        String regex = "\\b" + Pattern.quote(word) + "\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("A palvara '"+ word + "' aparece " + count + " vezes.");
    }
}
