public class Alumno{

	static int total = 0;
	int id = 0;
	private String nombre;
	String numCuenta;

	public Alumno(){
		total = total +1;
		id = total;
		this.nombre ="Don nadie";
		this.numCuenta = "000000000";
	}

	public Alumno(String nombre, String numCuenta){
		total = total +1;
		id = total;
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

	String getNombre(){
		return this.nombre;
	}

	public String toString(){
		return "Yo soy: " + nombre + " y mi id es:" + id;
	}
}





