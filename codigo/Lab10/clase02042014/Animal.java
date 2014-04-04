public abstract class Animal{
	
	private String tipo;

	public Animal(){
		this.tipo = "no definido";
	}

	public Animal(String tipo){
		this.tipo = tipo;
	}

	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getTipo(){
		return this.tipo;
	}

	abstract void comer();

}










