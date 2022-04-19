package entities4;

public class Product4 {

	private String name;
	private double price;
	private int quantity;
	
	// CONSTRUTORES
	public Product4() {
	}

	public Product4(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product4(String name, double price) { //Construtor sobrecarregado
		this.name = name;
		this.price = price;
	}
	
	// GETS E SETS
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price= price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//MÉTODOS
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				
				+ String.format("%.2f", totalValueInStock());
	}
}
