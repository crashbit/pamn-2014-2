public class test1{
	
	public static void main(String args[]){

		Animal arca[] = new Animal[4];
		Coche tsuru = new Coche();
		int i;

		Mamiferos gato = new Mamiferos();
		Mamiferos perro = new Mamiferos();
		Aves gallina = new Aves();

		arca[0] = gato;
		arca[1] = perro;
		arca[2] = gallina;
		arca[3] = tsuru;

		for(i = 0; i < 4; i++){
			arca[i].comer();
		}

	}

}