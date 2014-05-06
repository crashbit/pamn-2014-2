import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[])throws IOException{

		ServerSocket servidor = new ServerSocket(9000);
		System.out.println("Servidor listo...");
		
		Socket cliente = servidor.accept();
		System.out.println("Cliente conectado...");

		InputStreamReader entrada = new InputStreamReader(cliente.getInputStream());
		BufferedReader br = new BufferedReader(entrada);
		String cadena;

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

		cadena = br.readLine();
		System.out.println("El usuario escribio: " + cadena);

		// Le contestamos al usuario
		salida.println("Quihuboles mi chavo....");

	}

}







