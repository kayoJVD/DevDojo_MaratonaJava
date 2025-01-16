package DevDojoExercicios.Rdatas.Test.Exercicios.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraAtual {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

        System.out.println("Data e Hora Atual: "+ currentDateTime.format(formatter));
    }
}
