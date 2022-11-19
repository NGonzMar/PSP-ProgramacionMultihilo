package hilocuentabancaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Clase Log para identificar hora/tiempo/nombreHilo que se esta ejecutando
public class Log {

    static void log(String mensaje){
        System.out.println("[" + LocalDateTime.now() +  "] " + Thread.currentThread().getName() + ": " + mensaje);
    }
}
