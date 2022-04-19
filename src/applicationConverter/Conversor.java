package applicationConverter;

import java.util.Locale;
import java.util.Scanner;

import utilConverter.utilCurrencyConverter;

public class Conversor {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is the dollar price? ");
	double dolarPrice = sc.nextDouble();
	System.out.print("How many dollars will be bought? ");
	double pedidoDolares = sc.nextDouble();
	double result = utilCurrencyConverter.valorPagarReais (pedidoDolares, dolarPrice);
	System.out.printf("Amount to be paid in reais = %.2f%n", result);
	
	sc.close();

	}
	
}
