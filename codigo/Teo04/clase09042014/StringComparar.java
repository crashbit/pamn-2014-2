public class StringComparar implements HerramientaComparar{
	
	public int comparar(Object x1, Object x2){

		if((x1 instanceof String) && (x2 instanceof String)){

			if(((String)x1).compareTo((String)x2) == 1) 
				return mayor_que;
			else
				if(((String)x1).compareTo((String)x2) == -1)
					return menor_que;
				else
					return igual_que;
		}

		return 0;

	}

}