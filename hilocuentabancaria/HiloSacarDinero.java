package hilocuentabancaria;

public class HiloSacarDinero extends Thread {

    private CuentaBancaria cuenta; // monitor
    private String nombre;
    private int importe;

    // Constructor de la clase
    public HiloSacarDinero(CuentaBancaria cuenta, String nombre, int importe) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.importe = importe;
    }

    @Override
    public void run() {
        cuenta.sacarDinero(nombre, importe);
    }
}
