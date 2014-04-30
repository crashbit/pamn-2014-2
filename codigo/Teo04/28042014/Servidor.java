import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[]) throws IOException{

		ServerSocket servidor = new ServerSocket(9000);
		System.out.println("Servidor listo!!");
		Socket cliente = servidor.accept();

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		String cadena;

		cadena = entrada.readLine();

		salida.println("Usted escribio: " + cadena);

	}

}