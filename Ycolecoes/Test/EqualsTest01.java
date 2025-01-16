package DevDojoExercicios.Ycolecoes.Test;

import DevDojoExercicios.Ycolecoes.Dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1A245SB", "XIAOMI");
        Smartphone smartphone2 = new Smartphone("1A245SB", "XIAOMI");
        System.out.println(smartphone1.equals(smartphone2));
    }
}
