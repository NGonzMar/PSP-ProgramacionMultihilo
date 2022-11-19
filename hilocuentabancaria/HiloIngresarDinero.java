package hilocuentabancaria;

public class HiloIngresarDinero extends Thread {
    private CuentaBancaria cuenta; // monitor
    private String nombre;
    private int importe;

    // Constructor de la clase
    public HiloIngresarDinero(CuentaBancaria cuenta, String nombre, int importe) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.importe = importe;
    }

    @Override
    public void run() {
        cuenta.ingresarDinero(nombre, importe);
    }
}
