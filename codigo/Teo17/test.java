public class test{
	
	public static void main(String args[]){

		Alumno pedro = new Alumno();
		Alumno jose = new Alumno("Jose", "099210987");
		Alumno maria = new Alumno("Maria", "88309152");
		Ingenieria computacion = new Ingenieria();
		
		//pedro.setNombre("Pedro");
		
		System.out.println(pedro);	
		System.out.println(jose);	
		System.out.println(maria);
		System.out.println(computacion + "total : " + computacion.total);	

	}

}