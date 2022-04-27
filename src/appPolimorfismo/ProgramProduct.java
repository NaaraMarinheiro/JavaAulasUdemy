package appPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesPolimorfismo.ImportedProduct;
import entitiesPolimorfismo.Product;
import entitiesPolimorfismo.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //IMPORTANTE 
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int nProducts = sc.nextInt();
		
		for (int i=1; i<=nProducts; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i) ?");
			char response = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price:");
			double price = sc.nextDouble();
			if (response == 'i') {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee)); 
		
			} else if (response == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				
			} else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product produtos : list) {
			System.out.println(produtos.priceTag());
		}
	
		sc.close();
		
	}

}
