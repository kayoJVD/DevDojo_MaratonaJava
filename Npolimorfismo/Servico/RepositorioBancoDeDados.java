package DevDojoExercicios.Npolimorfismo.Servico;

import DevDojoExercicios.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um Banco de Dados");
    }
}
