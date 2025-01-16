package DevDojoExercicios.Rdatas.Test.Exercicios.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ManipulacaoDeDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma data (dd-MM-yyyy): ");
        String dataStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate dataInformada = LocalDate.parse(dataStr, formatter);
            LocalDate dataAtual = LocalDate.now();
            long diasDiferenca = ChronoUnit.DAYS.between(dataAtual, dataInformada);

            System.out.println("A diferença em dias é: " + diasDiferenca);
        }catch (DateTimeParseException e){
            System.out.println("Formato de data inválido. Por favor, use o formato DD-MM-YYYY." + e.getMessage());
        }




        scanner.close();
    }
}
