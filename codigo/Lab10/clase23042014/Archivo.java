import java.io.*;

public class Archivo{

	public static void main(String args[]) throws IOException{

		FileReader archivo = new FileReader("archivo.txt");
		BufferedReader br = new BufferedReader(archivo);
		String linea;

		while((linea=br.readLine())!=null)
			System.out.println("Linea: " + linea);

		archivo.close();

	}


}