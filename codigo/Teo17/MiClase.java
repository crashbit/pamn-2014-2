public class MiClase{
	
	int id;
	String nombre;
	int valor;

	public MiClase(int valor){
		this.valor = valor;
		System.out.println("Yo soy el constructor");
	}

	void Saluda(){
		System.out.println("Hola mundo");
	}

}