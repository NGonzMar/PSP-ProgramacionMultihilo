package hilocuentabancaria;

public class CajeroAutomatico {

    public static void main(String[] args) {

        // Creación de objeto cuenta (monitor)
        CuentaBancaria cuenta = new CuentaBancaria();

        // Creación de los movimientos bancarios (hilos)
        HiloSacarDinero h1 = new HiloSacarDinero(cuenta, "Dani", 500);
        HiloSacarDinero h2 = new HiloSacarDinero(cuenta, "Nuria", 200);
        HiloIngresarDinero h3 = new HiloIngresarDinero(cuenta, "Jeremy", 300);
        HiloSacarDinero h4 = new HiloSacarDinero(cuenta, "Pepe", 100);
        HiloIngresarDinero h5 = new HiloIngresarDinero(cuenta, "Javi", 400);

        System.out.println("SALDO INICIAL: " + cuenta.getSaldo() + " euros.");

        // Iniciar los hilos
            h1.start();
            h2.start();
            h3.start();
            h4.start();
            h5.start();

    }
}
