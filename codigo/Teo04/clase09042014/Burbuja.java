public class Burbuja{
	
	void ordenar(Object lista[], HerramientaComparar tool, boolean criterio){
		int total = lista.length;
		int i, j;
		Object temp;
		int tipo;

		if(criterio) tipo = 1;
			else tipo = -1;

		for(i = 0; i < total; i++){
			for(j = i+1 ; j < total; j++){
				if(tool.comparar(lista[i], lista[j])== tipo){
					temp = lista[i];
					lista[i] = lista[j];
					lista[j] = temp;
				}
			}
		}

		for(i=0;i < total;i++){
			System.out.println(lista[i]);
		}

	}

}