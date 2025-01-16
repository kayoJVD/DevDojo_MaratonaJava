package DevDojoExercicios.Associasao.Dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco, Seminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.print(this.endereco + " ");
        if (seminario != null) {
            System.out.println(seminario.getTitulo());
        }
    }
    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
