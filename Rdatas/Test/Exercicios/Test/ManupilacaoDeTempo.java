package DevDojoExercicios.Rdatas.Test.Exercicios.Test;

import java.time.LocalTime;

public class ManupilacaoDeTempo {
    public static void main(String[] args) {
        LocalTime timebeggin = LocalTime.of(10, 45);
        LocalTime timeFinal = timebeggin.plusHours(2).plusMinutes(15);

        System.out.println("Tempo inicial: " + timebeggin);
        System.out.println("Tempo final: " + timeFinal);
    }
}
