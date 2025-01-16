package DevDojoExercicios.Npolimorfismo.Dominio;

public class Televisao extends  Produto{
    public static final double IMPOSTO_PORcENTO = 0.10;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da TV");
        return this.valor * IMPOSTO_PORcENTO;
    }
}
