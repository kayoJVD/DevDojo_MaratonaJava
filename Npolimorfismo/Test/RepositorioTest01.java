package DevDojoExercicios.Npolimorfismo.Test;

import DevDojoExercicios.Npolimorfismo.Repositorio.Repositorio;
import DevDojoExercicios.Npolimorfismo.Servico.RepositorioBancoDeDados;
import DevDojoExercicios.Npolimorfismo.Servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
