import java.net.*;
import java.io.*;

public class clienteHilo extends Thread{
	
	private Socket cliente;
	private clienteHilo hilos[];
	private int totalClientes;
	private DataInputStream entrada;
	private PrintStream salida;
	private String nickname;

	public clienteHilo(Socket cliente, clienteHilo t[]){
		this.cliente = cliente;
		this.hilos = t;
		totalClientes = hilos.length;
	}

	void muestraLista(){
		int i;
		int pos = 0;
		for(i = 0 ; i < totalClientes; i++){
			if(hilos[i] == this) pos = i;
		}

		for(i = 0; i< totalClientes; i++){
			hilos[pos].salida.println(hilos[i].nickname);
		}
	}
	public void run(){
		int i; 
		String mensaje;

		try{
			entrada = new DataInputStream(cliente.getInputStream());
			salida = new PrintStream(cliente.getOutputStream());

			salida.println("*** Bienvenido al Chat Server ***");
			salida.println("Teclee su nickname >> ");
			nickname = entrada.readLine();
			salida.println("Hola " + nickname);

			for(i = 0 ; i < totalClientes; i++){
				if(hilos[i] != null && hilos[i] != this){
					hilos[i].salida.println("Acaba de conectarse " + nickname);
				}
			}

			while(true){
				mensaje = entrada.readLine();
				if(mensaje.startsWith("/salir")){break;}
				if(mensaje.startsWith("/lista")){muestraLista();}
				for(i = 0 ; i < totalClientes; i++){
					if(hilos[i] != null && hilos[i] != this){
						hilos[i].salida.println(nickname + " >> " + mensaje);
					}
				}
			}

			for(i = 0 ; i < totalClientes; i++){
				if(hilos[i] != null && hilos[i] != this){
					hilos[i].salida.println(nickname + " se retira ");
				}
			}

			for(i = 0 ; i < totalClientes; i++){
				if(hilos[i] == this){
					hilos[i] = null;
				}
			}

			entrada.close();
			salida.close();
			cliente.close();

		}catch(Exception e){
			System.out.println("No funciona");
		}

	}


}