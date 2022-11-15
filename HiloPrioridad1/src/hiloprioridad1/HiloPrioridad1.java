package hiloprioridad1;

//Clase que extiende Thread
class HiloPrioridad1 extends Thread {
	
	private int contador = 0; //Variable contador que se incrementa de 5 en 5 en el método run()
	private boolean stopHilo= false; 
 
 public HiloPrioridad1(String nombre) {
       super(nombre);		
 }
 
//Método getContador() -> obtiene el valor de la variable contador
 public int getContador()  {
        return contador;
 }  
 
 public void pararHilo()  {
         stopHilo = true;         
 }  
 
//Método pararHilo() -> para el hilo a través de una condición
 public void run() {
   while (!stopHilo) {
       try {
             Thread.sleep(2);
             
           } catch (Exception e) { }
           contador=contador+5;      	
   } 
   System.out.println("Fin hilo: " + this.getName());
   
 }
 
}  
