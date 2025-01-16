package DevDojoExercicios.Npolimorfismo.Servico;

import DevDojoExercicios.Npolimorfismo.Dominio.Computador;
import DevDojoExercicios.Npolimorfismo.Dominio.Produto;
import DevDojoExercicios.Npolimorfismo.Dominio.Tomate;

public class CalcaludoraImposto {
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if (produto instanceof  Tomate){
            Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataValidade());
        }
    }
}
