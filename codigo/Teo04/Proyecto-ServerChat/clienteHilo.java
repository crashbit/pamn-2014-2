import java.net.*;
import java.io.*;
import java.util.*;

public class clienteHilo extends Thread{
	
	private DataInputStream entrada = null; 
	private PrintStream salida = null;
	private Socket cliente = null;
	private clienteHilo[] hilos;
	private int total;
	String nickname;

	public clienteHilo(Socket cliente, clienteHilo[] hilos){
		this.cliente = cliente;
		this.hilos = hilos;
		this.total = hilos.length;
	}

	public void run(){
		int i;
		try{
			entrada = new DataInputStream(cliente.getInputStream());
			salida = new PrintStream(cliente.getOutputStream());
			salida.println("...Bienvenido al servidor de chat de PAMN...");
			salida.println("Nickname (apodo): ");
			nickname = entrada.readLine();
			System.out.println("Se conecto: "+ nickname);

			for(i=0; i < total; i++){
				if(hilos[i]!= null && hilos[i] != this){
					hilos[i].salida.println("Se conecto: " + nickname);
				}
			}

			while(true){
				String mensaje = entrada.readLine();
				System.out.println(nickname + " dijo: " + mensaje);
				if(mensaje.startsWith("/salir")) break;
				else{
					for(i=0; i < total; i++){
						if(hilos[i]!= null && hilos[i] != this){
							hilos[i].salida.println(nickname + ">" + mensaje);
						}
					}
				}
			}

			for(i=0; i < total; i++){
				if(hilos[i]!= null && hilos[i] != this){
					hilos[i].salida.println("El usuario:" + nickname + " se va!!");
				}
			}

			salida.println("Adios " + nickname);

			for(i=0; i < total; i++){
				if(hilos[i] == this){
					hilos[i] = null;
				}
			}

			entrada.close();
			salida.close();



		}catch(IOException e){
			System.out.println("No funciona...");
		}
	}
}








