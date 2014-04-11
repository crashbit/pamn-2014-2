public class testException{
	
	public static void evaluaAlumno(int calificacion) throws AlumnoException{
		if(calificacion <= 5) throw new AlumnoException("Vas a reprobar a un alumno");
		else
			System.out.println("Alumno aprobado");

	}

	public static void main(String args[]){

		int i;
		int arreglo[] = new int[3];
		try{
			//arreglo[10] = 20;
			//i = 1/0;
			System.out.println("Dentro del bloque try");	
			evaluaAlumno(4);
			

		}catch(ArithmeticException error){
			System.out.println("Error, error, error!!: " + error);
		}catch(ArrayIndexOutOfBoundsException error){
			System.out.println("Error  en el arreglo");
		}catch(AlumnoException error){
			System.out.println("Error de alumno y profe: "+error);
		}
		finally{
			System.out.println("Bloque finally");	
		}
		
		System.out.println("Fin del codigo");
	}
}










