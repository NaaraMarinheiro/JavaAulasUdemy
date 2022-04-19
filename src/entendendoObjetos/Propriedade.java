package entendendoObjetos;

public class Propriedade {

	public double a; // atributos
	public double b;
	private double c;
	
	public void capinar(int pagamento) { // m�todo - � um comportamento do objeto que ser� instaciado. 
		System.out.println("limpei o terreno e recebi " + pagamento); 
	}
	
	/**
	 * M�todo para recuperar o valor de um atributo privado
	 * @return o valor em c
	 */
	public double getC() {
		return c;
	}

	public void setC(double novoValor) {
		this.c = novoValor;
	}

	public static void main(String[] args) {
		
		Propriedade terreno = null; //criou uma vari�vel do tipo Triangulo vazia, sem espa�o reservado na mem�ria
		terreno = new Propriedade(); // criou um objeto na mem�ria, alocou espa�o na mem�ria, aloca��o din�micade mem�ria
		
		System.out.println(terreno); // retorna entendendoObjetos.Triangulo@2c7b84de  - os n�mero s�o o endere�o do lugar na mem�ria
		System.out.println(terreno.c);
		terreno.capinar(120);
	}
}
