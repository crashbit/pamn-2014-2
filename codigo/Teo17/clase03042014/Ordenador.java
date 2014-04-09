public abstract class Ordenador{
	
	void ordenar(Object lista[], HerramientaComparar herramienta){
		ordenar(lista, herramienta, false);
	}

	public abstract void ordenar(Object lista[], HerramientaComparar herramienta, boolean tipo_orden);	
}