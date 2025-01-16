package DevDojoExercicios.Npolimorfismo.Test;

import DevDojoExercicios.Npolimorfismo.Dominio.Computador;
import DevDojoExercicios.Npolimorfismo.Dominio.Produto;
import DevDojoExercicios.Npolimorfismo.Dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto1 = new Tomate("Tomate", 100);
        System.out.println(produto.getNome());
        System.out.println(produto1.getNome());
        System.out.println("===========");
        System.out.println(produto.getValor());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto() );
    }
}
