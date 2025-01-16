package DevDojoExercicios.Hherenca.Dominio;

public class Funcionario extends Pessoa {
    private double salario;


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do bloco de construtor de funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagmento() {
        System.out.println("Eu " + this.nome + "Recebi o valor dê R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
