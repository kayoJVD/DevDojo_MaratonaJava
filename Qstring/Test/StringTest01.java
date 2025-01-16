package DevDojoExercicios.Qstring.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Kayo";  //String constant poll
        String nome2 = "Kayo";
        nome = nome.concat(" Alves");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Kayo");
        System.out.println(nome2 == nome3.intern());
    }
}
