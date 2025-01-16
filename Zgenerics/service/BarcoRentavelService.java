package DevDojoExercicios.Zgenerics.service;

import DevDojoExercicios.Zgenerics.dominio.Barco;
import DevDojoExercicios.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),
            new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel....");
        Barco barco = barcoDisponiveis.remove(0);
        System.out.println("Alugando carro: " + barco);
        System.out.println(barcoDisponiveis);
        return barco;
    }

    public void retornarBarcolugado(Barco barco){
        System.out.println("Devolvendo carro "+barco);
        barcoDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcoDisponiveis);
    }
}
