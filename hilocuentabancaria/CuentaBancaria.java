package hilocuentabancaria;

public class CuentaBancaria {

    // Saldo inicial
    int saldo = 1000;

    // Metodo Get de 'saldo'
    public int getSaldo() {
        return saldo;
    }

    // Método sacarDinero:
    // nombre -> persona que realiza la operación
    // importe -> cantidad a retirar
    synchronized void sacarDinero(String nombre, int importe){

        if(saldo >= importe){
            Log.log(nombre + " saco de la cuenta " + importe + " euros.");

            saldo -= importe;

            Log.log("Saldo actual: " + saldo);

            //Después de la operación dormir el hilo
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else{

            Log.log(nombre + " no puede sacar " + importe + " euros de la cuenta. -> SALDO INSUFICIENTE");
            Log.log("Saldo actual: " + saldo + " euros.");

            //Después de la operación dormir el hilo
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Método ingresarDinero
    // nombre -> persona que realiza la operación
    // importe -> cantidad a retirar

    synchronized void ingresarDinero(String nombre, int importe){

        Log.log(nombre + " ingreso en la cuenta " + importe + " euros.");

        saldo += importe;

        Log.log("Saldo actual: " + saldo + " euros.");

        // Después de la operación dormir el hilo
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
