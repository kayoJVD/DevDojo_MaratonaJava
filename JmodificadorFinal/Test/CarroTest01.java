package DevDojoExercicios.JmodificadorFinal.Test;

import DevDojoExercicios.JmodificadorFinal.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kayo");
        System.out.println(carro.COMPRADOR);
    }
}
