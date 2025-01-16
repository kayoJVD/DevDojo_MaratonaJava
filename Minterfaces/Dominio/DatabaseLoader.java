package DevDojoExercicios.Minterfaces.Dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }

    @Override
    public void checkpermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    static void retrivieMaxDatSize(){
        System.out.println("Dentro do retrivieMaxDatSize no DataBaseLoader");
    }
}
