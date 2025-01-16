package DevDojoExercicios.Npolimorfismo.Servico;

import DevDojoExercicios.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando dentro da memoria");
    }
}
