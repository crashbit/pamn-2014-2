public class Burbuja extends Ordenador{
	public void ordenar(Object arreglo[], HerramientaComparar herramienta, boolean tipo_orden ){
		int i, j, n;
		Object temp;
		int orden;

		n = arreglo.length;
		if(tipo_orden) orden = 1;
		else orden = -1;
		for(i =0 ;i< n; i++){
			for(j = i+1 ; j< n;j++){
				if(herramienta.comparar(arreglo[i], arreglo[j]) == orden){
					temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}

		for(i=0;i<n;i++){
			System.out.println(arreglo[i] + ",");
		}
				
	}
}