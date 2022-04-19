package application3;

import java.util.Locale;
import java.util.Scanner;
import entities3.Student;

public class ProgramStudents {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante1 = new Student();
		
	System.out.print("Student name:");
	estudante1.name = sc.nextLine();
	System.out.println("Score 1:");
	estudante1.nota1 = sc.nextDouble();
	System.out.println("Score 2:");
	estudante1.nota2 = sc.nextDouble();
	System.out.println("Score 3:");
	estudante1.nota3 = sc.nextDouble();
	System.out.println("Max points:");
	estudante1.maxPoints = sc.nextDouble();
	
	System.out.println("FINAL GRADE = " + estudante1.grade());
	System.out.println(estudante1.verifyAprovation());
	
	if (estudante1.verifyAprovation() == "FAILED") {
		System.out.printf("MISSING %.2f POINTS%n", estudante1.missingPoints());
	}
	
	sc.close();
	
	}

}
