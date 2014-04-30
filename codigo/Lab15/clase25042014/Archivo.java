import java.io.*;

public class Archivo{

	public static void main(String args[]) throws IOException{
		
		FileReader archivo = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(archivo);
		String cadena;

		System.out.print("Teclea una cadena: ");
		while((cadena = br.readLine())!=null)
			System.out.println("Linea de archivo \t" + cadena);

	}
}
