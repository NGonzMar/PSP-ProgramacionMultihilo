package processbuilder;
import java.io.*;

public class EjecucionComando {

	public static void main(String[] args) {
		
		String comando = "pa";
		
		try {
			
			ProcessBuilder pb = new ProcessBuilder(comando);
			
			pb.redirectOutput(new File("output.txt")); // Redirigir salida al fichero 'output.txt'
			
			pb.start(); // Ejecución
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}
}
