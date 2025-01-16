package DevDojoExercicios.Associasao.Dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " +this.especialidade);
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Responsavel por ministrar os seminário(s) " + seminario.getTitulo());
        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
