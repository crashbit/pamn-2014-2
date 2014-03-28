import java.util.*;

public class Teclado{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String nombre;
		String lineaseparadora = System.getProperty("line.separator");

		scanner.useDelimiter(lineaseparadora);

		System.out.println("Teclea tu nombre:sss ");
		nombre = scanner.next();
		System.out.println("Bienvenido " + nombre);





	}
}