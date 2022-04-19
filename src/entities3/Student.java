package entities3;

/**
 * 
 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
resolver este problema. Entrada: Sa�da:
Entrada:  Alex Green, 17.00, 20.00, 15.00 || Sa�da:FINAL GRADE = 52.00 FAILED MISSING 8.00 POINTS
Entrada:  Alex Green, 27.00, 31.00, 32.00 || Sa�da:FINAL GRADE = 52.00 FAILED MISSING 8.00 POINTS
 *
 */
public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double maxPoints;
	
	public double grade() {
		return nota1 + nota2 + nota3;
	}
	
	public String verifyAprovation() {
		String retorno = "";
		double minimoPassar = 0.6 * maxPoints;
		if(grade()>= minimoPassar) {
			retorno = "PASS";
		} else {
			retorno = "FAILED";
		}
		return retorno;
	}
	
	public double missingPoints () {
		double points = (0.6 * maxPoints) - grade();
		return points;
	}
		
	//public String toString() {
		//return "MISSING " + String.format("%.2f", missingPoints() + "POINTS");

}
