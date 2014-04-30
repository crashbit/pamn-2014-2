
public class Prueba extends Thread{
	
	int iteraciones;
	String etiqueta;
	int tiempo;

	public Prueba(int iteraciones, String etiqueta, int tiempo){
		this.iteraciones = iteraciones;
		this.etiqueta = etiqueta;
		this.tiempo = tiempo;
	}

	public void run(){

		for(int i = 0; i < iteraciones; i++){
			System.out.println("Nom hilo:" + etiqueta + " iteracion: " + i);
			try{
				sleep(tiempo);
			}catch(InterruptedException e){

			}
		}

	}


}