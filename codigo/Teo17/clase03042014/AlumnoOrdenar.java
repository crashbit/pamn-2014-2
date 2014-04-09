public class AlumnoComparar implements HerramientaOrdenar{
	
	public int comparar(Object x1, Object x2){

		int resultado = 0;
		if((x1 instanceof Alumno) && (x2 instanceof Alumno))
			if((Alumno)x1.edad < (Alumno)x2.edad)
				return menor_que;
			else
				if((Alumno)x1.edad > (Alumno)x2.edad)
					return mayor_que;
				else
					return igual_que;
	}
}