package DevDojoExercicios.Hherenca.Dominio;

public class Person {
    private String name;
    private String id;
    private Address address;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void print(){
        System.out.println("===========================");
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.id);
        if (address != null){
            System.out.println("Rua: " + address.getRoad() + " CEP: " + address.getZipCode());
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
