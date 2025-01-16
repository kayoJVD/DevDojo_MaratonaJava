package DevDojoExercicios.Associasao.Test01;

import DevDojoExercicios.Associasao.Dominio.Aluno;
import DevDojoExercicios.Associasao.Dominio.Local;
import DevDojoExercicios.Associasao.Dominio.Professores;
import DevDojoExercicios.Associasao.Dominio.Seminario;

public class ExercicioSeminario {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kayo Alves", 26);
        Aluno aluno2 = new Aluno("Hemerson Alves", 15);

        Seminario seminario = new Seminario("Java Developer");
        Seminario seminario1 = new Seminario("Banco de dados");

        Local local1 = new Local("Sala 302 seminario dê", seminario);
        Local local2 = new Local("Sala 303 seminario dê", seminario1);

        Professores professores = new Professores("Gustavo Guanabara", "Desenvolvimento de software");
        Professores professores1 = new Professores("DevDojo", "JAVA");

        Seminario[] seminarios = {seminario, seminario1};
        Seminario[] seminarios1 = {seminario};

        professores.setSeminarios(seminarios);
        professores1.setSeminarios(seminarios1);


        local1.setSeminario(seminario);


        Aluno[] alunos = {aluno1, aluno2};

        seminario.setAlunos(alunos);

        local2.setSeminario(seminario1);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario1);


        professores.imprime();
        local1.imprime();
        aluno1.imprime();

        professores1.imprime();
        local2.imprime();
        aluno2.imprime();

    }
}
