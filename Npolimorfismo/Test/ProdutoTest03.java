package DevDojoExercicios.Npolimorfismo.Test;

import DevDojoExercicios.Npolimorfismo.Dominio.Computador;
import DevDojoExercicios.Npolimorfismo.Dominio.Produto;
import DevDojoExercicios.Npolimorfismo.Dominio.Tomate;
import DevDojoExercicios.Npolimorfismo.Servico.CalcaludoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);



        Tomate tomate = new Tomate("Americano", 100);
        tomate.setDataValidade("17/02/2025");
        CalcaludoraImposto.calcularImpostoProduto(tomate);
    }
}
