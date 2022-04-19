package entendendoObjetos;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		/*
		 * 1. For
		 * 2. While
		 * 3. Do while
		 */
		
		//1. For
		int[] numeros = new int[10];
		int[] numerosInvertidos = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = 10+i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[9-i]);
			numerosInvertidos[i] = numeros[9-i];
		}
	}

}
