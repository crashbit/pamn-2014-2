import java.io.*;

public class Parseo{

	public static void main(String args[]) throws IOException{

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(entrada);
		String linea;
		int x;

		System.out.println("Introduzca una linea: ");
		linea = br.readLine();
		x = Integer.parseInt(linea);
		System.out.println(x);
	}


}