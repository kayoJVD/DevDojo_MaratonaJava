package DevDojoExercicios.ZZAclassesInternas.test;
class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}
//class Cachorro extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Cachorro walking");
//    }
//}
public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
