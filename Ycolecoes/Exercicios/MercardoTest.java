package DevDojoExercicios.Ycolecoes.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MercardoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto balaFini = new Produto(3, "Fini de dentadura", 7.00);
        Produto nescau = new Produto(2, "Nescau Bom Gosto", 6.95);
        Produto leite = new Produto(1,"Leite Integral", 4.59);
        produtos.add(leite);
        produtos.add(nescau);
        produtos.add(balaFini);
        Cliente cliente = new Cliente("Kayo Alves", "123456789", 26);

        Mercado mercado = new Mercado();
        mercado.cadastrarProduto(leite);
        mercado.cadastrarProduto(nescau);
        mercado.cadastrarProduto(balaFini);

        mercado.cadastrarClienteArquivo(cliente);

        mercado.cadastrarCliente(cliente);
        mercado.cadastrarProdutos(balaFini, true);
        mercado.cadastrarProdutos(nescau, true);
        mercado.cadastrarProdutos(leite, true);

        System.out.println(leite.equals(nescau));

        Collections.sort(produtos);


        for (Produto produto: mercado.getProdutos()){
            System.out.println(produto);
        }

        System.out.println(cliente);
    }



}
