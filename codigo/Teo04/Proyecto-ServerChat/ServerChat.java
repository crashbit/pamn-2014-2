import java.net.*;
import java.io.*;
import java.util.*;

public class ServerChat{
	
	static Socket cliente;
	static clienteHilo[] t = new clienteHilo[10];


	public static void main(String args[]) throws IOException{
		int i=0;

		ServerSocket servidor = new ServerSocket(8000);
		System.out.println("...Servidor encendido...");
		while(i<10){
		
			cliente = servidor.accept();
			clienteHilo ch = new clienteHilo(cliente, t);
			t[i] = ch;
			ch.start();
			i++;
		}

	}
}