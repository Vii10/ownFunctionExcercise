package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class OwnFunction {
	
	public double ownFunction(List<Product> list, Predicate<Product> predi) { //Recebe um predicado para testar na função
		double sum = 0.0;
		for(Product p : list) {
			if(predi.test(p)) { //Acessa a função de teste no predicado predi e testa a condição p
				sum += p.getValue(); //Realiza o objetivo
			}
		}
		return sum;
	}
}
