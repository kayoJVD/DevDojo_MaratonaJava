package DevDojoExercicios.ZZAclassesInternas.test;

public class OuterClassTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void prinOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner inner = outerClass.new Inner();
        Inner inner1 = new OuterClassTest01().new Inner();
        inner.prinOuterClassAttribute();
        inner1.prinOuterClassAttribute();
    }
}
