package DevDojoExercicios.Pwrapper.Test;

public class WrapperVerificacaoDeNumeros {
    public static void main(String[] args) {
        String[] entradas = {"123", "abc", "145", "4a1", "541"};
        int contagem = 0;

        for (String entrada: entradas){
            try {
                Integer.parseInt(entrada);
                contagem++;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total de numeros inteiros: " + contagem);
    }
}
