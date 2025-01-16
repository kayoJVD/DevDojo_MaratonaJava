package DevDojoExercicios.Npolimorfismo.Test;

import DevDojoExercicios.Npolimorfismo.Dominio.Computador;
import DevDojoExercicios.Npolimorfismo.Dominio.Televisao;
import DevDojoExercicios.Npolimorfismo.Dominio.Tomate;
import DevDojoExercicios.Npolimorfismo.Servico.CalcaludoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell ", 11000);
        Tomate tomate = new Tomate("Siciliano ", 20);
        Televisao televisao = new Televisao("Samsung 50\" ", 2000);
        CalcaludoraImposto.calcularImpostoProduto(computador);
        System.out.println("=========================");
        CalcaludoraImposto.calcularImpostoProduto(tomate);
        System.out.println("=========================");
        CalcaludoraImposto.calcularImpostoProduto(televisao);
    }
}
