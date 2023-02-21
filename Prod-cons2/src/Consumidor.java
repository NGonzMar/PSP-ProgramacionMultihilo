//Clase consumidor: recoge número de la cola con método "get"
public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    //Constructor recibe la cola y un id para el hilo consumidor
    public Consumidor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    /**
     * Método que inicia el proceso 'Consumidor'
     * Irá recogiendo de la cola los números que le proporcione el 'Productor'
     */
    public void run() {
        int valor = 0; // Inicialización de la variable

        for (int i = 0; i < 5; i++) {
            valor = cola.get(); // Asignamos a la var 'valor' el número en cuestión -> get()
            System.out.println(i + " => Consumidor: " + n + ", consume: " + valor);
        }
    }
}
