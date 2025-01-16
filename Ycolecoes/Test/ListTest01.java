package DevDojoExercicios.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Kayo");
        nomes.add("Java Developer");
        nomes2.add("English Listen");
        nomes2.add("I love Cecilia");
        nomes.addAll(nomes2);

        for (String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("I love Java");

        System.out.println("------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
