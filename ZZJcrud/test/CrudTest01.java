package DevDojoExercicios.ZZJcrud.test;

import DevDojoExercicios.ZZJcrud.dominio.Anime;
import DevDojoExercicios.ZZJcrud.service.AnimeService;
import DevDojoExercicios.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            menu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0){
                break;
            }
            switch (op){
                case 1:
                    producerMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    ProducerService.menu(op);
                case 2:
                    animeMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    AnimeService.menu(op);
            }

        }
    }

    private static void producerMenu(){
        System.out.println("Type the number of");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go Back");
    }

    private static void menu(){
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");
    }

    private static void animeMenu(){
        System.out.println("Type the number of");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go Back");
    }
}
