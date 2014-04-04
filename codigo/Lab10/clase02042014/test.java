public class test{
	
	public static void main(String args[]){

		Animal aguila = new Aves();
		Aves gallina = new Aves();
		Mamiferos gato = new Mamiferos();
		gallina.setTipo("America");

		System.out.println(aguila.getTipo());
		System.out.println(gallina.getTipo());
		System.out.println(gato.getTipo());
		gato.comer();
	}

}