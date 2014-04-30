import java.net.*;
import java.io.*;

public class Servidor{

	public static void main(String args[]){

		ServerSocket servicio;

		try{
			servicio = new ServerSocket(9000);
			System.out.println("Servicio activo");
			Socket usuario = servicio.accept();
			String cadena;

			PrintWriter salida = new PrintWriter(usuario.getOutputStream(), true);
			
			InputStreamReader isr = new InputStreamReader(usuario.getInputStream());
			BufferedReader entrada = new BufferedReader(isr);	
	
			salida.println("Bienvenido usuario: ");
			salida.println("login: ");
			cadena = entrada.readLine();
			salida.println("Usted es el usuario: " + cadena);
			System.out.println("El usuario escribio: " + cadena);_	
			usuario.close();


		}catch(IOException e){
			System.out.println(e);
		}
	}
}