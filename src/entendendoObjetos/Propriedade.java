package entendendoObjetos;

public class Propriedade {

	public double a; // atributos
	public double b;
	private double c;
	
	public void capinar(int pagamento) { // método - é um comportamento do objeto que será instaciado. 
		System.out.println("limpei o terreno e recebi " + pagamento); 
	}
	
	/**
	 * Método para recuperar o valor de um atributo privado
	 * @return o valor em c
	 */
	public double getC() {
		return c;
	}

	public void setC(double novoValor) {
		this.c = novoValor;
	}

	public static void main(String[] args) {
		
		Propriedade terreno = null; //criou uma variável do tipo Triangulo vazia, sem espaço reservado na memória
		terreno = new Propriedade(); // criou um objeto na memória, alocou espaço na memória, alocação dinâmicade memória
		
		System.out.println(terreno); // retorna entendendoObjetos.Triangulo@2c7b84de  - os número são o endereço do lugar na memória
		System.out.println(terreno.c);
		terreno.capinar(120);
	}
}
