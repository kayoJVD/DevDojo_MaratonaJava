package DevDojoExercicios.Isobrescrita.Dominio;

public class Anime {
    private String nome;
    private String personagem;
    private String poder;

    public Anime(String nome, String personagem, String poder) {
        this.nome = nome;
        this.personagem = personagem;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Anime: " + this.nome
                + "\nPersonagem: " + this.personagem +
                "\npoder: " + this.poder ;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

}
