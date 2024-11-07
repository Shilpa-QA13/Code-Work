package ecommerce.classes;

public class Order {
	public String customer_order(Product p) {
		return p.name;
	}
	public void place_order(Product p,int quantity) {
		p.reduce_stock(quantity);
		
	}

}
