package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Validar um CPF
public class CPFValidator {
    public static void main(String[] args) {
        String cpf = "457.423.028-27";
        String regex = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);

        while (matcher.find()){
            System.out.println("CPF válido: " + matcher.matches() + " " + matcher.group());
        }

    }
}
