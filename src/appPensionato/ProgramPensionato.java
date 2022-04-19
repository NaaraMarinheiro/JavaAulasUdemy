package appPensionato;

import java.util.Locale;
import java.util.Scanner;

import entitiesPensionato.PensionatoVetor;

public class ProgramPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PensionatoVetor[] vect = new PensionatoVetor[10];

		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("\nInforme o quarto escolhido: ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();

			System.out.println("Informe o nome do locatário: ");
			String nome = sc.nextLine();

			System.out.println("Informe o email do locatário: ");
			String email = sc.nextLine();

			vect[numeroQuarto] = new PensionatoVetor(nome, email, numeroQuarto);

		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
			
			
	}

}
