import java.net.*;
import java.io.*;

public class Servidor{

	public static void main(String args[]){

		ServerSocket servicio;
		OutputStream salida;
		InputStream entrada;

		try{
			servicio = new ServerSocket(9000);
			System.out.println("Servicio activo");
			Socket usuario = servicio.accept();
	
			salida = usuario.getOutputStream();
			entrada = usuario.getInputStream();

			DataInputStream flujo1 = new DataInputStream(entrada);
			DataOutputStream flujo2 = new DataOutputStream(salida);
			

			flujo2.writeBytes("hola usuario");
			System.out.println(flujo1.readDouble());
			usuario.close();


		}catch(IOException e){
			System.out.println(e);
		}
	}
}