public class StringComparar implements HerramientaComparar{

	public int comparar(Object x1, Object x2){

		int resultado = 0;
		if((x1 instanceof String) && (x2 instanceof String))

			resultado = ((String)x1).compareTo((String)x2);
			if(resultado < 0)
				return menor_que;
			else
				if(resultado > 0)
					return mayor_que;
				else
					return igual_que;
	}
}