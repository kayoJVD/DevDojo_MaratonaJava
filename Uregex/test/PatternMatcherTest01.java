package DevDojoExercicios.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        /*
        \d = Todos os digitos
        \D = Tudo que não for digito
        \s = Espaços em brancos \t \r \n \f
        \S = Todos os caracteres excluindo os brancos
        \w = a-ZA-Z, d´gigitos
        \W = Tudo p que não for incluso no \w

         */
        String regex = "aba";
        String texto = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto   " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }
    }
}
