import java.io.*;

public class Salida{
	
	public static void main(String args[])throws IOException{

		FileWriter archivo = new FileWriter("salida.txt");
		BufferedWriter br = new BufferedWriter(archivo);
		PrintWriter salida = new PrintWriter(br);

		String saludos[] = {"Hola", "Quihubo", "Que tal!!"};

		for(int i = 0; i < saludos.length; i++){
			salida.println(saludos[i]);
		}

		salida.close();

	}
}
