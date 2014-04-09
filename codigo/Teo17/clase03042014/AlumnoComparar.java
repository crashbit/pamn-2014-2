public class AlumnoComparar implements HerramientaComparar{
	
	public int comparar(Object x1, Object x2){

		int resultado = 0;
		int edad1  = ((Alumno)x1).edad;	
		int edad2  = ((Alumno)x2).edad;
		
		if(edad1 < edad2)
			return menor_que;
		else
			if(edad1 > edad2)
				return mayor_que;
			else
				return igual_que;
	}
}