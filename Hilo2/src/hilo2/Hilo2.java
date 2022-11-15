package hilo2;

public class Hilo2 extends Thread{

	// Constructor de la clase
	Hilo2(String nombre){
		
		super(nombre);
		System.out.println("Creando HILO:" + getName());
	}
	
	// Método run() -> funcionalidad del hilo
	public void run() {
		
		for (int i = 1; i <= 5; i++) System.out.println("Hilo: " + getName() + "Valor del contador i = " + i);
		
		try {
			
			Thread.sleep(20000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	// Método principal main -> crea 3 hilos
	public static void main(String[] args) {
		
		Hilo2 h1 = new Hilo2(" 1 ");
		Hilo2 h2 = new Hilo2(" 2 ");
		Hilo2 h3 = new Hilo2(" 3 ");	
		
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}
}
