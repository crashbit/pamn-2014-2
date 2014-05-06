import java.net.*;
import java.io.*;

public class Conecta{
	
	public static void main(String args[])throws IOException{

		String servidor;
		int puerto;

		servidor = args[0];
		puerto = Integer.parseInt(args[1]);
		Socket socket = new Socket(servidor, puerto);
		
		PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

		InputStreamReader entrada = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(entrada);
		String cadena;

		salida.println("get /index.html");
		while((cadena = br.readLine())!=null)
			System.out.println(cadena);

	}



}






