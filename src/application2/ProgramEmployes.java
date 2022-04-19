package application2;

/**
 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em 
seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o 
sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � 
afetado pela porcentagem) Classe: Employee || -Name: String -GrossSlary:double -Tax: double ||
+ NetSalary(): double + IncreaseSalary(percentage: double) :void.
 */

import java.util.Locale;
import java.util.Scanner;
import entities2.Employes;

public class ProgramEmployes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employes empregado1 = new Employes();

		System.out.print("Name:");
		empregado1.name = sc.nextLine();
		System.out.print("Sal�rio bruto:");
		empregado1.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		empregado1.tax = sc.nextDouble();

		//System.out.println("Employee:" + empregado1.name + " , " + "$" + empregado1.netSalary());
		
		System.out.println();
		System.out.println("Employee:" + empregado1);
		System.out.println();

		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		empregado1.increaseSalary(percentage); //adicionado esse no gabarito

		//System.out.println(
			//"Update data:" + empregado1.name + ",  $" + (empregado1.increaseSalary(percentage) - empregado1.tax));
		System.out.println();
		System.out.println("Update data: " + empregado1);
		
		sc.close();
	}

}
