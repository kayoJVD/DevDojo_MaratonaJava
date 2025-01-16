package DevDojoExercicios.Rdatas.Test.Exercicios.Dominio;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class Banco {
    private String name;
    private int account;
    private ArrayList<Cliente> clientes;

    public Banco(String name, int account) {
        this.name = name;
        this.account = account;
        this.clientes = new ArrayList<>();
    }

    public void adionarCliente(Cliente cliente) throws IOException{
        clientes.add(cliente);
    }

    public void remcverCliente(Cliente cliente)throws IOException {
        clientes.remove(cliente);
    }
    public void exibirClientes()throws IOException{
        for (Cliente cliente: clientes){
            System.out.println(cliente);
            Locale locale = new Locale("pt", "BR");
            System.out.println(locale);
            LocalDateTime date = LocalDateTime.now();
            System.out.println(date);
        }
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", clientes=" + clientes +
                '}';
    }
}
