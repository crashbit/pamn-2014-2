import java.io.*;

public class Archivo{
	
	public void muestraInfoArchivo(String ruta) throws IOException{

		File archivo = new File(ruta);
		if(archivo.exists()){

			System.out.println("Nombre: " + archivo.getName());
			System.out.println(" - Ruta completa" + archivo.getAbsolutePath());
			System.out.println("Tamaño: " + archivo.length() + "bytes");
			System.out.println(" - Ultima modificacion :" + archivo.lastModified());
			if(archivo.isFile()){
				System.out.println("Archivo normal");
			} 
			else if(archivo.isDirectory()){
				System.out.println(" Es un directorio");
				muestraContenidoDirectorio(archivo);
			}
		}else
			throw new IOException("No se encuentra el Archivo");	
	}

	public void muestraContenidoDirectorio(File directorio){
		String archivos[] = directorio.list();
		for(int i =0; i<archivos.length; i++){
			System.out.println("\t " + archivos[i]);
		}
	}

	public static void main(String args[]) throws IOException{
		Archivo test = new Archivo();
		if(args.length > 0)
			test.muestraInfoArchivo(args[0]);
		else
			System.out.println("Se debe usar asi: java Archivo <nomarchivo>");

	}


}

