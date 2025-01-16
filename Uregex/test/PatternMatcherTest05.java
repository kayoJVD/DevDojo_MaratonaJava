package DevDojoExercicios.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /*
        \d = Todos os digitos
        \D = Tudo que não for digito
        \s = Espaços em brancos \t \r \n \f
        \S = Todos os caracteres excluindo os brancos
        \w = a-ZA-Z, digitos
        \W = Tudo p que não for incluso no \w
         []
         ? Zero ou uma ocorrencia
         * Zero ou mais
         + Uma ou mais ocorrencia
         {n,m} de n até m
         ()
         | o (v|c)o ovo | oco
         $ fim da linha
         . 1.3 = 123, 133, 1@3 1A3
         */
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.com, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")).trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto   " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
