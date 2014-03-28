public class Alumno{
	
	static int total;
	private int id;
	private String nombre;
	private String numCuenta;

	static{
		total = 0;
	}

	public Alumno(){
		this.total = this.total + 1; 
		this.id = total;
		this.nombre = "Don nadie";
		this.numCuenta = "000000000";
	}

	public Alumno(String nombre, String numCuenta){
		this.total = this.total + 1; 
		this.id = total;
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

	String getNombre(){
		return this.nombre;
	}

	void setId(int id){
		this.id = id;
	}

	int getId(){
		return this.id;
	}

	void setNumCuenta(String numCuenta){
		this.numCuenta = numCuenta;
	}

	String getNumCuenta(){
		return this.numCuenta;
	}

	public String toString(){
		return "yo me llamo " + this.nombre + " con num. cuenta:" + this.numCuenta;
	}

	void lee(){
		System.out.println(nombre + " está leyendo");
	}

	void escribe(){
		System.out.println(nombre + " está escribiendo");	
	}
}







