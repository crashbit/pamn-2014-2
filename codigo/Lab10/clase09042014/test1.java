public class test1{
	
	public static void evaluaAlumno(int calificacion) throws AlumnoError{
		if(calificacion <= 5) throw new AlumnoError("Alumno Reprobado!!!");
	}

	public static void main(String args[]){
		try{
			evaluaAlumno(3);
		}
		catch(AlumnoError error){
			System.out.println("Usted ha reprobado a un alumno");
		}
	}

}