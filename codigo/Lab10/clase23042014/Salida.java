import java.io.*;

public class Salida{

	public static void main(String args[]) throws IOException{

		FileWriter archivo = new FileWriter("salida.txt");
		BufferedWriter bw = new BufferedWriter(archivo);
		PrintWriter salida = new PrintWriter(bw);

		String cadenas[] = {"Hola", "Adios", "Hasta luego", "nuevo"};

		for(int i = 0; i< cadenas.length; i++){
			salida.println(cadenas[i]);
		}

		salida.close();

	}


}