package entities2;

public class Employes {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary (double percentage) {
		grossSalary += percentage/100 * grossSalary;
	}
		// Gabarito - deveria usar o método toString
	public String toString() {
		return name + " , $ " + String.format("%.2f", netSalary());
	}
		
	}
	
