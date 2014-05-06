

public class Alumno extends Thread{
	String etiqueta;
	int repeticiones;
	int duracion;

	public Alumno(String etiqueta, int repeticiones, int duracion){
		this.etiqueta = etiqueta;
		this.repeticiones = repeticiones;
		this.duracion = duracion;
	}
	
	public void run(){
		int i;

		for(i = 0; i < repeticiones; i++){
			System.out.println(etiqueta + " " + i);
			try{
				sleep(duracion);
			}catch(InterruptedException e){
				
			}
		}
	}
}