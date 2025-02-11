package DevDojoExercicios.ZZAclassesInternas.test;

public class OuterClassTeste02 {
    private String name = "Neymar Junior";

    void print(){
        final String lastName = "Da Silva";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();;
    }
    public static void main(String[] args) {
        OuterClassTeste02 outer = new OuterClassTeste02();
        outer.print();
    }
}
