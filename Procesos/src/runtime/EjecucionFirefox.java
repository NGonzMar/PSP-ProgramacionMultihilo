package runtime;
import java.io.*;

public class EjecucionFirefox {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime(); // Creación y asignación de objeto 'r' de tipo Runtime 
		
		String comando = "/usr/bin/firefox"; // Cadena que contiene la sentencia "ls -la" | Ejecutar Firefox
		
		try {
			
			//Process r = Runtime.getRuntime().exec("/usr/bin/firefox");
			Process p = r.exec(comando); //  Ejecuta el comando especificado en la variable de tipo String
			
		}catch(Exception e) {
			
			System.out.println("ERROR con la sentencia: " + comando);
			System.out.println(e.getMessage());
			
		}
	}
}
