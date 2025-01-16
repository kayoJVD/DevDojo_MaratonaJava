package DevDojoExercicios.Npolimorfismo.Servico;

import DevDojoExercicios.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
