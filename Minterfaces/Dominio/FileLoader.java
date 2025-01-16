package DevDojoExercicios.Minterfaces.Dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregadno dados de um arquivo");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkpermission() {
        System.out.println("Checando permissões nos arquivos");
    }
}
