package DevDojoExercicios.Hherenca.Test;

import DevDojoExercicios.Hherenca.Dominio.Address;
import DevDojoExercicios.Hherenca.Dominio.Employee;
import DevDojoExercicios.Hherenca.Dominio.Person;

public class TestInheritance {
    public static void main(String[] args) {
        Address address = new Address("Sanhaço", "06236-835");
        Person person = new Person("Kayo Alves ", "45742302827", address);
        person.setAddress(address);

        Address address1 = new Address("Maguari ", "06236-836 ");
        Employee employee = new Employee("Proramação", "Java Developer", 10000,"Kayk Alves", "45747847", address1);

        person.print();
        employee.print();
    }
}
