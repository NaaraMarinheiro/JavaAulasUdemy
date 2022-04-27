package appHeranca;

import entitiesHeranca.AccountHeranca;
import entitiesHeranca.BusinessAccount;
import entitiesHeranca.SavingsAccount;

public class ProgramHeranca {

	public static void main(String[] args) {

		// Teste de Override
		AccountHeranca acc8 = new AccountHeranca(1001, "Alex", 1000.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		AccountHeranca acc9 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc9.withdraw(200.0);
		System.out.println(acc9.getBalance());
		
		AccountHeranca acc10 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		
		/*		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPSCASTING - Objeto da subclasse atribuido a um objeto da superclasse
		
	AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING 
		
		// BusinessAccount acc4 = acc2; -  mesmo instanciando ela não pode ser convertida para BusinessAccount 
		// Conversão não natural
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// só vai dar problema quando executar : Exception in thread "main" java.lang.ClassCastException: class entitiesHeranca.SavingsAccount cannot be cast to class entitiesHeranca.BusinessAccount (entitiesHeranca.SavingsAccount and entitiesHeranca.BusinessAccount are in unnamed module of loader 'app')
		//at appHeranca.ProgramHeranca.main(ProgramHeranca.java:30)
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//Para evitar esse tipo de erro, basta testar com o instance of
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
					
		}
		
*/	}

}
