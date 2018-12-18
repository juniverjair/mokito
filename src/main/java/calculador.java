public class calculador implements operaciones {

	@Override
	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	@Override
	public int restar(int a, int b) {
		int bn = -b;
		int resultado = sumar(a,bn);
		return resultado;
	}

	@Override
	public int multiplicar(int a, int b) {
		int resultado = 0;
		for (int i = 0; i != b; ++i) {
			resultado = sumar(resultado,a);
		}
		return resultado;
	}

	@Override
	public int dividir(int a, int b) {
		int resultado = 0;
	    while (a > 0) {
	        resultado++;
	        a = restar(a,b);								
	        } 
		return resultado;
	}




}
