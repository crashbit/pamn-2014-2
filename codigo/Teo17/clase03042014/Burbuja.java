public class Burbuja extends Ordenador{
	void ordenar(Object arreglo[], HerramientaComparar herramienta, boolean tipo_orden ){
		int i, j, n;
		Object temp;

		n = arreglo.length();

		for(i =0 i< n; i++){
			for(j = i+1 ; j< n;j++){
				if(herramienta.comparar(arreglo[i], arreglo[j]) < 0){
					temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}
				
	}
}