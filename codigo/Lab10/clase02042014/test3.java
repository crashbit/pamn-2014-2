public class test3{
	
	public static void main(String args[]){

		try{
			verificaAlumno("Jazmin", 5);
			verificaAlumno("Jazmin", 4);

		}catch(Exception errorcillo){
			System.out.println(errorcillo);
		}


	}

	public static void verificaAlumno(String nombre, int cal) throws Exception{
		if(nombre.compareTo("Jazmin")==0) throw new Exception("Usted no puede reprobar a:" + nombre);			
		else
			throw new Exception("Usted debe reprobar a " + nombre);
	}
}






