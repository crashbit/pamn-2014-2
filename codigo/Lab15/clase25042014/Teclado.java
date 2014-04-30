import java.io.*;

public class Teclado{

	public static void main(String args[]) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cadena;
		int a;

		System.out.print("Teclea una cadena: ");
		cadena = br.readLine();
		a = Integer.parseInt(cadena);
		System.out.println(a);

	}
}
