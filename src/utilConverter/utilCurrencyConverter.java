package utilConverter;

/**
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos. ex.: What is the dollar price? 3.10 How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20
 */
public class utilCurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double valorPagarReais (double pedidoDolares, double dolarPrice) {
		return pedidoDolares * dolarPrice * (1.0 + IOF); 
	}

}
