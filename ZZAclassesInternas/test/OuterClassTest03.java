package DevDojoExercicios.ZZAclassesInternas.test;

public class OuterClassTest03 {
    private String name = "Kayo Fut Dev";
    static class Nestd{
        private String lastName = "Nubank";
        void print(){
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nestd nestd = new Nestd();
        nestd.print();

    }
}
