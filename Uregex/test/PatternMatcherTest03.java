package DevDojoExercicios.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
                /*
        \d = Todos os digitos
        \D = Tudo que não for digito
        \s = Espaços em brancos \t \r \n \f
        \S = Todos os caracteres excluindo os brancos
        \w = a-ZA-Z, d´gigitos
        \W = Tudo p que não for incluso no \w
         []
         */
        //String regex = "[a-zA-C]";
        //String texto = "cafeBAB";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto   " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
//        int numeroHex = 0x59F86A;
//        System.out.println(numeroHex);
    }
}
