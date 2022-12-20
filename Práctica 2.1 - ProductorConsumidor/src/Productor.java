// Clase Productor
public class Productor extends Thread {
    private Deposito dep;

    //Constructor clase -> Productor
    public Productor(Deposito dep){
        this.dep = dep;
    }

    /**
     * Método que inicia el proceso 'Productor'
     * Irá añadiendo a la cola los litros
     */
    public void run() {
        for (int i = 0; i <= 15; i++) {
            double litros = (int)(Math.random() * 1000);
            dep.llenar(litros);

            try {
                sleep(100);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}