package DevDojoExercicios.Hherenca.Dominio;

public class Employee extends Person{
    private String sector;
    private String position;
    private double wage;

    public Employee(String sector, String position, double wage, String name, String id, Address address) {
        super(name, id, address);
        this.sector = sector;
        this.position = position;
        this.wage = wage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Departamento: " + this.sector);
        System.out.println("Cargo: " + this.position);
        System.out.println("Salário: R$" + this.wage);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wqge) {
        this.wage = wqge;
    }
}
