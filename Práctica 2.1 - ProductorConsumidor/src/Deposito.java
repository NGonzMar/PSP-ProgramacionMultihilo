// Clase Deposito -> Contendrá los métodos necesarios de llenar() y recoger()
public class Deposito {
    private double litros;
    private boolean empty = true;

    /**
     * Método que recogerá el valor en litros que genere el 'Productor'
     * Mientras esté vacío esperará, ya que necesita una cantidad que recoger
     * Cambiamos el valor de la flag -> true (para indicar que ya hemos recogido los litros del depósito)
     * Notificamos al proceso dormido (Productor)
     * Devolvemos el valor de los litros que recogimos
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
     * Función que a partir de indicarle un valor, llenará en litros un camión
     * Se le pasará el valor de los litros como parámetro (double)
     * Mientras esté lleno esperará, ya que necesita que se encuentre vacío para llenar el camión
     * Cambiamos el valor de la flag -> false (para indicar que ya hemos llenado los litros del depósito)
     * Asignamos el valor indicado (parámetro) a la variable 'litros'
     * Notificamos al proceso dormido (Productor)
     */
    public synchronized void llenar(double valor){
        while(!empty){
            try {
                wait();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        empty = false;

        litros = valor;
        System.out.println("Productor llena el depósito con -> " + valor + " litros.");

        notify(); // Despierto a la refinería
    }
}
