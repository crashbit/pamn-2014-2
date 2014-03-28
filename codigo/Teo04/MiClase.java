public class MiClase{
	
	int id;
	String nombre;
	String []materias = new String[4];


	public MiClase(){
		System.out.println("Soy un constructor");
		materias[0] = new String("Calculo");
	}

	public MiClase(int id){
		this.id = id;
		System.out.println("Tengo un id" + this.id);
	}

	public MiClase(String nombre){
		this.nombre = nombre;
		System.out.println("Me llamo: " + this.nombre);
	}

	public String toString(){
		return "Hola soy un objeto";
	}

}


