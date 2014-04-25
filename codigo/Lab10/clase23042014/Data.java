import java.io.*;

public class Data{

	public static void main(String args[]) throws IOException{

		FileOutputStream archivo = new FileOutputStream("data.txt");
		BufferedOutputStream bos = new BufferedOutputStream(archivo);
		DataOutputStream dos = new DataOutputStream(bos);

		dos.writeDouble(3.14159);
		dos.writeBytes("Estos son bytes");
		dos.writeChars("Estos son chars");
		dos.writeUTF("Raices de 2, este fué el ultimo ejercicio");


		dos.close();

	}


}