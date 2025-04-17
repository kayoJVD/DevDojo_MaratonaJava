package DevDojoExercicios.ZZHpadroesdeprojeto.test;

import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderpatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Kayo")
                .lastName("Alves")
                .username("kayoloks")
                .email("alveskayo689@gmail.com")
                .build();
        System.out.println(build);
    }

}
