package DevDojoExercicios.Zgenerics.test;

import DevDojoExercicios.Zgenerics.dominio.Carro;
import DevDojoExercicios.Zgenerics.service.CarroRentavelService;

public class ClassegenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarcarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
