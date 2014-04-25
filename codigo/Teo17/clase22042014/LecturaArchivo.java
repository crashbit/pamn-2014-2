import java.io.*;

public class LecturaArchivo{
	
	public static void main(String args[]) throws IOException{

		FileReader archivo = new FileReader("Teclado.java");
		InputStreamReader lector;
		BufferedReader br;
		String cadena;

		lector = new InputStreamReader(System.in);
		
		br = new BufferedReader(archivo);

		System.out.println("Teclea una cadena:");
		while((cadena = br.readLine())!= null)
			System.out.println(cadena );
	}
}