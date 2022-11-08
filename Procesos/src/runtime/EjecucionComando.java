package runtime;
import java.io.*;

public class EjecucionComando {

	public static void main (String[] args) {
		
		// Process r = Runtime.getRuntime().exec("ls -la");
		
		Runtime r = Runtime.getRuntime(); // Creación y asignación de objeto 'r' de tipo Runtime 
			
		String comando = "ls -la"; // Cadena que contiene la sentencia "ls -la" | Listado de contenido
		
		try {
			
			// La salida del comando no va a la terminal
			Process p = r.exec(comando); // Ejecuta el comando especificado en la variable de tipo String
			
			// Creación de objeto 'is' de tipo  InputStream
			InputStream is = p.getInputStream(); // Asignación al objeto 'is' el valor del flujo para leer la salida
			
			// Creación de un BufferedReader para leer el InputStream de 'is'
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea; // Variable donde almacenaremos la información del comando
			while(((linea = br.readLine())!= null)) System.out.println(linea);
			
			br.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR con la sentencia: " + comando);
			System.out.println(e.getMessage());
			
		}
	}
} 
