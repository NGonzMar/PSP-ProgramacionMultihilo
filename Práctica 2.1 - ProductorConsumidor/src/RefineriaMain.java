// Clase Principal Refineria
public class RefineriaMain {

    public static void main(String[] args) {

        Deposito deposito = new Deposito();

        Productor producer = new Productor(deposito);
        Camion camion1 = new Camion(deposito, 1);
        Camion camion2 = new Camion(deposito,2);
        Camion camion3 = new Camion(deposito, 3);

        producer.start();
        camion1.start();
        camion2.start();
        camion3.start();
    }
}
