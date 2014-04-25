import java.io.*;

public class Archivo{

	public static void main(String args[]) throws IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		FileReader archivo = new FileReader("Teclado.java");
		BufferedReader br = new BufferedReader(archivo);
		String cadena;

		System.out.print("Leyendo archivo: ");
		while((cadena = br.readLine())!= null)
			System.out.println("Linea: " + cadena);


	}



}