package DevDojoExercicios.Pwrapper.Test;

import java.util.ArrayList;
import java.util.List;

public class WrapperSomaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        int soma = 0;
        for (Integer numero: numeros){
            soma += numero;
        }
        System.out.println("A soma entre os numeros são: " + soma);
    }
}
