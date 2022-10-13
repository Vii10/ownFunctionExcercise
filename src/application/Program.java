package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.OwnFunction;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	
		OwnFunction oF = new OwnFunction(); //Precisa chamar a classe com um novo objeto para poder acessar a função desejada
		
		//Sysout com lambda inline
		System.out.println("Sum = " + oF.ownFunction(list, p -> p.getName().charAt(0) == 'T'));
	}

}
