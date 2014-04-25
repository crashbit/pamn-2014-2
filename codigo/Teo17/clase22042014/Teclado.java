import java.io.*;

public class Teclado{
	
	public static void main(String args[]) throws IOException{

		InputStreamReader lector;
		BufferedReader br;

		lector = new InputStreamReader(System.in);
		
		br = new BufferedReader(lector);

		System.out.println("Teclea una cadena:");
		String cadena = br.readLine();
		System.out.println("Usted tecleo: " + cadena );
	}
}