package DevDojoExercicios.Hherenca.Test;

import DevDojoExercicios.Hherenca.Dominio.Endereco;
import DevDojoExercicios.Hherenca.Dominio.Funcionario;
import DevDojoExercicios.Hherenca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua sanhaço.");
        endereco.setCep("06236-835");

        Pessoa pessoa = new Pessoa("Kayo Alves");
        pessoa.setCpf("45742302827");

        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Hemerson");
        funcionario.setCpf("41244561561");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        pessoa.imprime();
        System.out.println("--------------");
        funcionario.imprime();
    }
}
