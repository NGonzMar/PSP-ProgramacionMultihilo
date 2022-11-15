// Clase1 Hilo1 extiende de Thread
package hilo1_v2;

import java.util.Iterator;

public class Hilo1_V2 extends Thread{

	private int x;
	private String y;
	
	// Constructor de la clase
	Hilo1_V2(int x, String y){
		this.x = x;
		this.y = y;
	}
	
	// Método run() -> funcionalidad del hilo
	public void run(){
		for (int i = 0; i < x; i++) {
			
			System.out.println("Ejecutando dentro del Hilo... " + i + y);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}	
		}
	}
	
	// Metodo main
	public static void main(String[] args) {
		
		Hilo1_V2 p = new Hilo1_V2(10, " -> Ejecutando hilo1");
		p.start();
		
		Hilo1_V2 p2 = new Hilo1_V2(5, " -> Ejecutando hilo2");
		p2.start();
		
		System.out.println("Hola");
	}
}
