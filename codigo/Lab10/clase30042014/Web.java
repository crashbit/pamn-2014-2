import java.net.*;
import java.io.*;


public class Web{

	public static void main(String args[]) throws IOException{

		Socket cliente = new Socket("www.unam.mx", 80);
		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);
		String cadena;

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

		salida.println("get /index.html");
		while((cadena = entrada.readLine())!=null)
			System.out.println(cadena);

	}


}