public class Test{
	
	public static void main(String args[]){

		String arreglo[] = new String[3];
		StringComparar tool = new StringComparar();
		Burbuja prueba = new Burbuja();

		Alumno alumnos[] = new Alumno[4];
		AlumnoComparar tool2 = new AlumnoComparar();


		arreglo[0] ="Hola";
		arreglo[1] ="Adios";
		arreglo[2] ="Que tal";

		alumnos[0] = new Alumno(10);
		alumnos[1] = new Alumno(15);
		alumnos[2] = new Alumno(20);
		alumnos[3] = new Alumno(40);

		alumnos[0].setEdad(30);

		prueba.ordenar(arreglo, tool, true);
	
		prueba.ordenar(alumnos, tool2, true);
	}
}