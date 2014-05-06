public class Test{
	
	public static void main(String args[]){

		Alumno unam = new Alumno("UNAM", 100, 500);
		Alumno ipn = new Alumno("IPN", 100, 1000);

		unam.start();
		ipn.start();

	}
}