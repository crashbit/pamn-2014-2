public class test2{
	
	public static void main(String args[]){

		String nombre[] = new String[2];
		int i;

		try{
			//i = 1/0;
			nombre[0] = "Pedro";
			nombre[1] = "Juan";
			//nombre[2] = "Lalo";
		}catch(ArrayIndexOutOfBoundsException variable){
			System.out.println("Ey hubo un error: " + variable);
		}catch(ArithmeticException variable){
			System.out.println("Error matematico: " + variable);
		}finally{
			System.out.println("Se ejecuta finally");
		}

	}
}






