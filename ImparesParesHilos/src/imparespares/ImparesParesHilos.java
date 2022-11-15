package imparespares;

public class ImparesParesHilos implements Runnable{
	//Clase implementa interfaz Runnable.
	// La interfaz Runnable añade la funcionalidad de Hilos a una clase con solo implementarla
	// Runnable proporciona un único método "run"
	private boolean par;

	//método run -> funcionalidad del hilo
	public ImparesParesHilos (boolean par){
	    this.par=par;
	}
	    
	public void run() {
		if (par) {
	       for (int i = 1; i <= 100; i++) {
	           if (i%2==0) {
	                System.out.println("HILO "+ Thread.currentThread().getId()+" generando numero par " + i);
	           }
	        }
	        } else {
	            for (int i = 101; i <= 200; i++) {
	                if (i%2==0) {
	                    System.out.println("HILO "+ Thread.currentThread().getId()+" generando numero impar " + i);
	                }
	            }
	        }
		}
	
	    public static void main(String[] args) {
	        ImparesParesHilos hilo1 = new ImparesParesHilos(false);
			Thread hiloTh1 = new Thread(hilo1);

			ImparesParesHilos hilo2 = new ImparesParesHilos(true);
			Thread hiloTh2 = new Thread(hilo2);
			
			hiloTh1.setPriority(10); // Máxima prioridad
			hiloTh2.setPriority(1); //Mínima prioridad
			
			hiloTh1.start();
			hiloTh2.start();
	}
}	    
