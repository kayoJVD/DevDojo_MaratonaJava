package DevDojoExercicios.Rdatas.Test;

import java.util.Calendar;
import java.util.Scanner;
import java.util.SortedMap;

public class ManipuladorDeDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma data (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        Calendar calendar = Calendar.getInstance();
        obterData(calendar, dataStr);

        while (true){
            System.out.println("\nMenu");
            System.out.println("1 Adcionar dias");
            System.out.println("2. Adcionar meses");
            System.out.println("3. Adcionar anos");
            System.out.println("4. Exibir data");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção");

            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Quandos dias deseja adcionar? ");
                    int dias = scanner.nextInt();
                    calendar.add(Calendar.DAY_OF_MONTH, dias);
                    break;
                case 2:
                    System.out.println("Quantos meses deseja adcionar? ");
                    int meses = scanner.nextInt();
                    calendar.add(Calendar.MONTH, meses);
                    break;
                case 3:
                    System.out.println("Quantos anos deseja adcionar? ");
                    int anos = scanner.nextInt();
                    calendar.add(Calendar.YEAR, anos);
                    break;
                case 4:
                    exibirData(calendar);
                case 5:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    private static Calendar obterData(Calendar calendar, String dataStr) throws NumberFormatException{
        String[] partes = dataStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt((partes[2]));
        return calendar;
    }

    private static void exibirData(Calendar calendar){
        System.out.printf("Data atual: %02d/%02d/%04d%n",
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }
}
