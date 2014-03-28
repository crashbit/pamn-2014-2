public class test{
	
	public static void main(String args[]){

		MiClase clase = new MiClase("Pedro");

		System.out.println(clase);

		clase.id = 3;
		clase.nombre = "Luis ojos rojos :P";

		System.out.println("Yo soy " + clase.nombre+ " y mi id es: " + clase.id);

	}

}