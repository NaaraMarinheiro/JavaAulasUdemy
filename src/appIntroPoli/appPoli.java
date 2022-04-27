package appIntroPoli;

import entitiesHeranca.AccountHeranca;
import entitiesHeranca.SavingsAccount;

public class appPoli {

	public static void main(String[] args) {
		
		AccountHeranca x = new AccountHeranca(1020, "Alex", 1000.0);
		AccountHeranca y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
