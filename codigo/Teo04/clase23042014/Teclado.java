//Este es un comentario
import java.io.*;

public class Teclado{


	public static void main(String args[]) throws IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(entrada);
		String cadena;

		System.out.print("Teclea algo: ");
		cadena = br.readLine();
		System.out.println("Usted tecleo: " + cadena);


	}

}