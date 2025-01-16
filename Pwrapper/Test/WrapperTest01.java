package DevDojoExercicios.Pwrapper.Test;

public class WrapperTest01 {
    public static void main(String[] args) {
        int numeroPrimitivo = 42;
        String numero = "60";
        Integer numeroWrapper = Integer.valueOf(numero);

        System.out.println("Valor do int: " + numeroPrimitivo);
        System.out.println("Valor do Interger: " + numero);
        System.out.println("Tipo do iIntergernt: " + numeroWrapper.getClass().getName());

        Byte biteW = 1;
        Short shortW = 10;
        Integer intergerW = 100;
        Long longW = 1000L;
        Float floatW = 100F;
        Double dloubeW = 10D;
        Character charW = 'M';
        Boolean boleanW = false;
    }
}
