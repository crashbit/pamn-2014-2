import java.io.*;

public class SalidaData{
	
	public static void main(String args[])throws IOException{

		FileOutputStream archivo = new FileOutputStream("Data.txt");
		BufferedOutputStream bos = new BufferedOutputStream(archivo);
		DataOutputStream salida = new DataOutputStream(bos);

			salida.writeDouble(3.14159);
			salida.writeBytes("Esta es una cadena de bytes\n");
			salida.writeChars("Esta es una cadena de chars\n");
			salida.close();

	}
}
