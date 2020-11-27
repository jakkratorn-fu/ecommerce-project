package ECommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Product> cartItems = new ArrayList<Product>();
	
	public Product getProductById(int id) {
		
		return null;
	}
	public void printProduct() {
		for(Product prod : cartItems) {
			System.out.println(prod.getName());
		}
	}
}
