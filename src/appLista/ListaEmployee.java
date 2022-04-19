package appLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesLista.Employee;

public class ListaEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciar uma lista de funcionários. 
		//No caso, usar o tipo "List" generics, e instanciar a interface List instanciando a classe concreta qua implementa a interface.
		List<Employee> list = new ArrayList<>();
			
		//PARTE 1 - READING DATA
		
		System.out.println("How many employees will be registered?");
		int employees = sc.nextInt();
	
		for (int i = 1; i<= employees; i++) {
			System.out.println();
			System.out.println("Employee#: " + i + ":  "); //imprimir dinamicamente
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee (id,name, salary));
			
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	// Outro escopo, outro "list" como parametro.
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	

	}

}
