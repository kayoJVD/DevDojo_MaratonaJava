package DevDojoExercicios.Oexception.Runtime.Test;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,1));
    }
    private static int divisao(int a, int b){
        if (b ==0){
            throw new RuntimeException("Argumento invalido, não pode ser 0");
        }
        try {
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;
    }
}
