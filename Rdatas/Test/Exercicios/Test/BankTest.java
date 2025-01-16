package DevDojoExercicios.Rdatas.Test.Exercicios.Test;

import DevDojoExercicios.Rdatas.Test.Exercicios.Dominio.Banco;
import DevDojoExercicios.Rdatas.Test.Exercicios.Dominio.Cliente;
import DevDojoExercicios.Rdatas.Test.Exercicios.Dominio.Pagamento;
import DevDojoExercicios.Rdatas.Test.Exercicios.Dominio.TipoConta;

import java.io.IOException;


public class BankTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kayo Alves", "45742302827", 26, TipoConta.PESSPA_FISICA, Pagamento.CREDITO);

        Cliente cliente1 = new Cliente("Danielle", "123456789", 25, TipoConta.PESSOA_JURIDICA, Pagamento.PIX);
        Banco banco = new Banco("Santander", 1);


        try {
            banco.adionarCliente(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Desconto pagamento no CREDITO " + Pagamento.CREDITO.desconto(100));

        try {
            banco.adionarCliente(cliente1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Desconto pagammento no PIX " + Pagamento.PIX.desconto(100));
        try {
            banco.exibirClientes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            banco.remcverCliente(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            banco.exibirClientes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
