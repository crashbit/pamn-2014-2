import java.io.*;

public class DataIn{

	public static void main(String args[]) throws IOException{

		FileInputStream archivo = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(archivo);
		DataInputStream dis = new DataInputStream(bis);

		System.out.println(dis.readDouble());
		System.out.println(dis.readByte());
		dis.close();

	}


}