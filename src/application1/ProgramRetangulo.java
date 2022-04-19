package application1;

import java.util.Locale;
import java.util.Scanner;
import entities1.Rectangle;

public class ProgramRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo1 = new Rectangle();
		
		//Ler valores da largura e altura do retangulo
		
		System.out.println("Insira os valores da largura e altura.");
		System.out.print("Largura: ");
		retangulo1.width = sc.nextDouble();
		System.out.print("Altura: ");
		retangulo1.height = sc.nextDouble();
		
		System.out.println("A altura do retangulo é: " + retangulo1.width);
		System.out.println("A largura do retangulo é: " + retangulo1.height);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("A área do retangulo é:" + retangulo1.area());
		System.out.println("O perimetro do retangulo é: " + retangulo1.perimeter());
		System.out.println("A diagonal do retangulo é: " + retangulo1.diagonal());
		
		sc.close();
	}

}
