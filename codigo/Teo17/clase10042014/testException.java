public class testException{
	
	public static void suma(int a, int b) throws Exception{
		if(a < b) throw new Exception("A debe ser mayor que b"); 
	}

	public static void main(String args[]) throws Exception{

		int []arreglo = new int[3];

		try{
			suma(3,5);
			arreglo[2] = 10;
			int i = 1/0;
			throw new Exception("Errorcito");
				
		}catch(ArithmeticException var){
			System.out.println("Hubo un error" + var);	
		}
		catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Hubo un error por el arreglo... " + var);	
		}finally{
			System.out.println("Clausula finally");
		}
		System.out.println("Ultimo bloque");
	}
}