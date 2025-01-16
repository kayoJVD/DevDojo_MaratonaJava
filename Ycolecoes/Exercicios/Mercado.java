package DevDojoExercicios.Ycolecoes.Exercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Produto> produtos;
    private List<Cliente> clientes;

    public Mercado() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "produtos=" + produtos +
                ", clientes=" + clientes +
                '}';
    }


    public void cadastrarClienteArquivo(Cliente cliente){
        try (OutputStream os = new FileOutputStream("mercado.txt");
             OutputStreamWriter osw = new OutputStreamWriter(os);
             BufferedWriter bw = new BufferedWriter(osw)){


            String linha = cliente.getNome() + ", " + cliente.getCpf() + ", " + cliente.getIdade();

            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();
            System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso");
        }catch (IOException e){
            System.out.println("Erro ao cadastrar cliente " + e.getMessage());
        }
    }

    public void cadastrarProdutos(Produto produto, boolean opcao){
        try (OutputStream os = new FileOutputStream("produto.txt", opcao);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw)){

        String linha = produto.getId() + ", " + produto.getNome() + ", " + produto.getPreco();

        bw.write(linha);
        bw.newLine();

        bw.close();
        osw.close();
        os.close();
        System.out.println(produto.getNome() + " cadastrado com sucesso");
        }catch (IOException e){
            System.out.println("Falha ao criar o arquivo " + e.getMessage());
        }
    }



    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
