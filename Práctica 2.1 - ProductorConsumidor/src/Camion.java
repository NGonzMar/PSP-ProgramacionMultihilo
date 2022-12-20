// Clase Camion -> CONSUMIDOR
public class Camion extends Thread {
    private Deposito dep;
    private int numCamion;

    //Constructor clase camión
    public Camion (Deposito dep, int numCamion) {
        this.dep = dep;
        this.numCamion = numCamion;
    }

    /**
     * Método que inicia el proceso 'Consumidor'
     * Irá recogiendo de la cola los litros que le proporcione el 'Productor'
     */
    public void run() {
        double litros;

        for (int i = 0; i <= 5; i++) {
            litros = dep.recoger();
            System.out.println("Camión " + numCamion + " carga -> " + litros + " litros.");
        }
    }
}

