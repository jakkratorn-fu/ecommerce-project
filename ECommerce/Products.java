package ECommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Products {
	private final ArrayList<Product> products = new ArrayList<Product>();
	
	public Products() {
		
	}
	public List<Product> getProducts() {
		return this.products;
	}
	public void initStoreItem() {
		String [] productName = {};
		double [] productPrice = {};
		int [] productStock = {};
		
		for (int i = 0; i < productName.length; i++) {
			this.products.add(new Product(i+1, productName[i], productPrice[i], productStock[i]));
		}
 	}
}
