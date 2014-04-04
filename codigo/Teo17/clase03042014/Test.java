public class Test{
	
	public static void main(String args[]){

		String arreglo[] = new String[3];
		StringComparar tool = new StringComparar();
		Burbuja prueba = new Burbuja();

		arreglo[0] ="Hola";
		arreglo[1] ="Adios";
		arreglo[2] ="Que tal";

		prueba.ordenar(arreglo, tool);
	}
}