public class Alumno{
	
	static int total = 0;
	private int id=0;
	private String nombre;
	private String numCuenta;

	public Alumno(){
		id = generarId();
		nombre = "nobody";
		numCuenta = "000000000";
		System.out.println("Constructor de alumno");
	}

	public Alumno(String nombre, String numCuenta){
		id = generarId();
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}

	int generarId(){
		return (total = total +1);
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

	String getNombre(){
		return this.nombre;
	}

	void setNumCuenta(String numCuenta){
		this.numCuenta = numCuenta;
	}

	String getNumCuenta(){
		return this.numCuenta;
	}
	public String toString(){
		return "Alumno:"+id + " Nombre: "+nombre + " Num. Cuenta:" + numCuenta;
 	}
}