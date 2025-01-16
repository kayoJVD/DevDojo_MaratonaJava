package DevDojoExercicios.Minterfaces.Dominio;

public interface DataLoader {
    int MAX_DATE_SUIZE = 10;
    void load();

    default void checkpermission(){
        System.out.println("Checando permissões");
    }

    static void retrivieMaxDatSize(){
        System.out.println("Dentro do retrivieMaxDatSize na interface");
    }
}
