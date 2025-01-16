package DevDojoExercicios.Ycolecoes.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exe01 {
    public static void main(String[] args) {
        List<Time> times = new ArrayList<>();
        Time t1 = new Time("Flamengo", "Gabigol");
        Time t2 = new Time("Flamengo", "Bruno Henrique");
        Time t3 = new Time("São Paulo", "Lucas Moura");


        System.out.println(t1.equals(t3));
        times.add(t2);
        times.add(t1);
        times.add(t3);

    }
}
