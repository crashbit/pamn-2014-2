public class test{
	
	public static void main(String args[]){

		String lista[] = new String[4];
		StringComparar tool = new StringComparar();
		Burbuja burbuja = new Burbuja();

		lista[0] = "Luis";
		lista[1] = "Pedro";
		lista[2] = "Zaira";
		lista[3] = "Memo";

		burbuja.ordenar(lista, tool, false);
	}
}