package DevDojoExercicios.Wnio.Exercicio;

import java.io.IOException;
import java.nio.file.*;

public class MonitorDirectory {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta");

        try (WatchService watchService = FileSystems.getDefault().newWatchService()){
            // Registra o diretorio no WatchService
            dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            System.out.println("Monitorando o diretório: "+dir);

            while (true) {
                WatchKey key;
                try {
                    key = watchService.take();
                } catch (InterruptedException e) {
                    return;
                }

                // Processa eventos
                for (WatchEvent<?> event : key.pollEvents()){
                    System.out.println("Evento: " + event.kind() + " no aquivo" + event.context());
                }

                //Reseta a chave para continuar monitorando
                boolean valid = key.reset();
                if (!valid){
                    break;
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
