package DevDojoExercicios.Uregex.test.Exercicios;
// Substituir espaços múltiplos por um único espaço
public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "Isto      é   um     texto    com  espaços  multiplos";
        String regex = "\\s+";

        String result = input.replaceAll(regex, " ");
        System.out.println(result);
    }
}
