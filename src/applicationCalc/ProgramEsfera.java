package applicationCalc;

import java.util.Locale;
import java.util.Scanner;
import utilCalc.CalculatorEsfera;

public class ProgramEsfera {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = CalculatorEsfera.circumference(radius);
		double v = CalculatorEsfera.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorEsfera.PI);
		
		sc.close();
	}
}
