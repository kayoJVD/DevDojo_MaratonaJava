package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Extrair todas as URLs de um texto
public class ExtractURLs {
    public static void main(String[] args) {
        String text = "Visite http://exemplo.com e https://outroexemplo.com.";
        String regex = "https?://[\\w.-]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("URL encontrada: " + matcher.group());
        }
    }
}
