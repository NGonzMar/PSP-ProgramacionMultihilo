// Clase Deposito -> Contendrá los métodos necesarios de llenar() y recoger()
public class Deposito {
    private double litros;
    private  boolean empty = true;

    /**
     * Método que recogerá el valor en litros del 'Productor'
     */
    public synchronized double recoger(){
        while (empty){
            try {
                wait();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        empty = true;
        notify();
        return litros;
    }

    /**
     * Función que generará un num aleatorio de litros para llenar el depósito de un camión
     * @return litros (num aleatorio)
     */
    public synchronized void llenar(double valor){
        while(!empty){
            try {
                wait();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        // Se encuentra el camión vacío
        empty = false;

        litros = valor;
        System.out.println("Productor llena el depósito con -> " + valor + " litros.");

        notify(); // Despierto a la refinería
    }
}