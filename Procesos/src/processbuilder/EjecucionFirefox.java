package processbuilder;
import java.io.IOException;

public class EjecucionFirefox {

	public static void main (String[] args) {
		
		try {
			
			System.out.println("\nCreando proceso\n");
			String cmd = "/usr/bin/firefox";
			ProcessBuilder builder = new ProcessBuilder(cmd);
			
			Process p = builder.start();
			
			System.out.println("\nEsperando 10 segundos...\n");
			Thread.sleep(10000);
			
			p.destroyForcibly();
			System.out.println("\nProceso " + cmd + " detenido forzosamente.\n");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}	
	}
} 
