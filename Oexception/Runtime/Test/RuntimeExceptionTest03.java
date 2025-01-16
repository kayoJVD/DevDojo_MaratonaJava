package DevDojoExercicios.Oexception.Runtime.Test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
