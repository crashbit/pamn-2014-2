import java.net.*;
import java.io.*;

public class ChatServer{
	
	static Socket cliente;
	static clienteHilo t[] = new clienteHilo[10];

	public static void main(String args[]) throws IOException{
		int i = 0;
		ServerSocket servidor = new ServerSocket(9000);
		System.out.println("!!Servidor listo!!");
		
		while(i< 10){
			cliente = servidor.accept();
			clienteHilo ch = new clienteHilo(cliente, t);
			t[i] = ch;
			ch.start();
			i++;
		}

	}
}