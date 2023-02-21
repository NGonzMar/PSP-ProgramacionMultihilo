//Clase Productor: produce números y los pone en la cola usando método "put"
public class Productor extends Thread {
    private Cola cola;
    private int n;

    //Constructor recibe la cola y un id para el hilo productor
    public Productor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    /**
     * Método que inicia el proceso 'Productor'
     * Irá añadiendo a la cola números del 0 al 5
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); // Escribe el número en la cola -> put(i)
            System.out.println(i + " => Productor : " + n + ", produce: " + i);

            try {
                sleep(100); // Dormimos el proceso 100 ms para que los consumidores tengan que esperar obligatoriamente (ya que son + rápidos)

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}