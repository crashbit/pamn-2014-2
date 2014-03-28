public class test{

	public static void main(String args[]){

		Alumno pedro = new Alumno();
		Alumno juan = new Alumno("Juan", "89909021");

		System.out.println(pedro + " y " + juan);
		pedro.lee();
		juan.lee();

		Ingenieria computacion = new Ingenieria();
		//computacion.setNombre("Computologo");
		computacion.lee();
		computacion.escribe();

	}
}