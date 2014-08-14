import java.net.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Servidor{
	
	public static void main(String args[]){

		Servidor servidor = new Servidor();
		servidor.escucha(8080);
	}

	public void escucha(int puerto){
		try{
			ServerSocket servidor = new ServerSocket(puerto);
			Socket cliente;
			cliente = servidor.accept();

			cliente.setSoLinger(true, 10);

			ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());

			Object mensaje =  ois.readObject();

			if(mensaje instanceof MensajeDameArchivo){
				System.out.println("Me piden: " + (MensajeDameArchivo)mensaje.nombreArchivo);
				enviarArchivo((MensajeDameArchivo)mensaje.nombreArchivo, oos);
			}
			else{
				System.out.println("Error, mensaje no esperado" + mensaje.getClass().getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}