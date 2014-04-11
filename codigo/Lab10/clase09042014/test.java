public class test{
	
	public static void main(String args[]){

		int x[] = new int[5];
		int y;
		try{
			y = 1/0;
			x[5]=10;

		}catch(ArrayIndexOutOfBoundsException error){
			System.out.println("Error al asignar valor");
		}finally{
			System.out.println("Ejecutando finally");	
		}
		System.out.println("Fin del programa");
	}

}