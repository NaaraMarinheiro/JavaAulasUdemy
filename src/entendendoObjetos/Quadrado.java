package entendendoObjetos;

public class Quadrado {

	public static void main(String[] args) {
		Propriedade outroTerreno = new Propriedade(); 	//criou e instanciou na mesma linha
		outroTerreno.a = 250;
		outroTerreno.setC(320.0);
		
		System.out.println(outroTerreno.getC());
		outroTerreno.capinar(200);
	}

}
