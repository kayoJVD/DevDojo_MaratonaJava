package DevDojoExercicios.LclassesAbstratas.Test;

import DevDojoExercicios.LclassesAbstratas.Dominio.Desenvolvedor;
import DevDojoExercicios.LclassesAbstratas.Dominio.Funcionario;
import DevDojoExercicios.LclassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 4000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Usopp", 6000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
