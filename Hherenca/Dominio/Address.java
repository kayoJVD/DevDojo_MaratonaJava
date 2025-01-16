package DevDojoExercicios.Hherenca.Dominio;

public class Address {
    private String road;
    private String zipCode;

    public Address(String road, String zipCode) {
        this.road = road;
        this.zipCode = zipCode;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
