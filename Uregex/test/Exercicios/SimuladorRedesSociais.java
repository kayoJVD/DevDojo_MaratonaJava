package DevDojoExercicios.Uregex.test.Exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimuladorRedesSociais {
    private static final String POSTAGEM_REGEX = "[a-zA-Z0-9.,!?@#\\s]+$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao simulador de Feed de Notícias");
        while (true){
            System.out.println("\nDigite sua postagem (ou 'sair' para encerrar):");
            String postagem = scanner.nextLine();

            if (postagem.equalsIgnoreCase("sair")){
                break;
            }
            if (validarPostagem(postagem)){
                System.out.println("Postagem válida");

                int countHastags = contarHastags(postagem);
                int countMentions = contarMentions(postagem);

                System.out.println("Número de hastags: " + countHastags);
                System.out.println("Número de menções: " + countMentions);
            }else {
                System.out.println("Postagem inválida! Somente letras, números e os símbolos: . , ? são permitidos" );
            }

        }
        scanner.close();
    }

    public static boolean validarPostagem(String postagem){
        Pattern pattern = Pattern.compile(POSTAGEM_REGEX);
        Matcher matcher = pattern.matcher(postagem);

        return matcher.matches();
    }

    public static int contarHastags(String postagem){
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(postagem);

        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }

    public static int contarMentions(String postagem){
        Pattern pattern = Pattern.compile("@\\w+");
        Matcher matcher = pattern.matcher(postagem);

        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
