public class test{
	
	public static void main(String args[]){

		Alumno pedro = new Alumno();
		Alumno mike = new Alumno("Mike", "123456789");
		Alumno pablito_mix = new Alumno("Pablito", "987654321");

		pedro.setNombre("Pedro");
		System.out.println(pedro);
		System.out.println(mike);
		System.out.println(pablito_mix);
	}
}