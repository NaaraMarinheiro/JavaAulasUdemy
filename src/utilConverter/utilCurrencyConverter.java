package utilConverter;

/**
 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda 
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos. ex.: What is the dollar price? 3.10 How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20
 */
public class utilCurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double valorPagarReais (double pedidoDolares, double dolarPrice) {
		return pedidoDolares * dolarPrice * (1.0 + IOF); 
	}

}
