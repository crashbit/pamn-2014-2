public abstract class Ordenador{
	
	void ordenar(Object lista[], HerramientaComparar herramienta){
		ordernar(lista, herramienta, false);
	}

	public abstract void ordernar(Object lista[], HerramientaComprar herramienta, boolean tipo_orden);	
}