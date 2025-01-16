package DevDojoExercicios.Pwrapper.Test;

import java.util.ArrayList;

public class WrapperMaxMin {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(2.6);
        numeros.add(6.0);
        numeros.add(1.0);

        Double max = numeros.get(0);
        Double min = numeros.get(0);

        for (Double numero: numeros){
            if (numero > max){
                max = numero;
            }
            if (numero < min){
                min = numero;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
