package DevDojoExercicios.Npolimorfismo.Test;

import ChatGpt.Dominio.Fruta;
import ChatGpt.Dominio.Produto;
import ChatGpt.Dominio.Xbox;
import ChatGpt.Servico.CalcularImposto;


public class ProdutoTest {
    public static void main(String[] args) {
        Xbox produto = new Xbox("Xbox Series S", 5000);
        Fruta  produto1 = new Fruta("Laranja Pera", 10);
        CalcularImposto.calcularImposto(produto);
        System.out.println("===============");
        CalcularImposto.calcularImposto(produto1);
        Fruta fruta = new Fruta("Pera", 10);
        fruta.setDataValidade("10/11/2023");
        fruta.getDataValidade();
    }
}
