package DevDojoExercicios.Rdatas.Test.Exercicios.Dominio;


public class Cliente {
    private String name;
    private String cpf;
    private int idade;
    TipoConta tipoConta;
    Pagamento pagamento;

    public Cliente(String name, String cpf, int idade) {
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Cliente(String name, String cpf, int idade, TipoConta tipoConta, Pagamento pagamento) {
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
        this.tipoConta = tipoConta;
        this.pagamento = pagamento;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + getName() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", idade=" + getIdade() +
                ", tipoConta=" + getTipoConta() +
                ", pagamento=" + getPagamento() +
                '}';
    }
}
