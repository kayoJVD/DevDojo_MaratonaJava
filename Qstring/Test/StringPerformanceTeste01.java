package DevDojoExercicios.Qstring.Test;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        concattring(30000);
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto para a String " + (fim - inicio) + "ms");

        long inicio = System.currentTimeMillis();
        concatStringBuilder(100_0000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_0000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuffer " + (fim - inicio) + "ms");
    }

    private static void concattring(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 013, 014
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);// 0, 01, 012, 013, 014
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);// 0, 01, 012, 013, 014
        }
    }
}
