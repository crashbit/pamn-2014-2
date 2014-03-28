import java.util.*;
import java.text.*;

public class Fechas{
	
	public static void main(String args[]){

		Date fecha = new Date();
		System.out.println(fecha);

		SimpleDateFormat formato = new SimpleDateFormat("dd/MMMM/yy");

		System.out.println(formato.format(fecha));		

	}

}