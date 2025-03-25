package DevDojoExercicios.ZZGconcorrencia.test;




import DevDojoExercicios.ZZGconcorrencia.dominio.Members;
import DevDojoExercicios.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");

        Thread pain = new Thread(new EmailDeliveryService(members), "Pain");

        jiraya.start();
        pain.start();

        while (true){
            String email = JOptionPane.showInputDialog("Enre com o seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
