package entendendoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x;
		x = new Triangulo();
		
		Triangulo y;
		y = new Triangulo();
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		double areaDeX = x.calcularArea();
		System.out.printf("A area de X é: %.4f%n", areaDeX);
		
		
		System.out.println("Enter the measures of triangle Y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		double areaDeY = y.calcularArea();
		System.out.printf("A area de X é: %.4f%n",areaDeY);


		if (areaDeX > areaDeY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
