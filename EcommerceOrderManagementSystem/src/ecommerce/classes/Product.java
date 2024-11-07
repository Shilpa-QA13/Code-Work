package ecommerce.classes;

public class Product implements IstockManager {
	public String name;
    public double  price;
    public int stock;
    public Product(String name,double price,int stock) {
    	this.name=name;
    	this.price=price;
    	this.stock=stock;
    }
    public String get_Details() {
    	return this.name+" "+this.price+" "+this.stock;
    }
    public boolean isProductAvailable() {
    	if(this.stock>=1) {
    		System.out.println(this.name +" is avialable");
    		return true;
    	}else {
    		return false;
    	}
    }
    public void reduce_stock(int quantity) {
    	if (isProductAvailable()) {
    		stock=stock-quantity;
    		System.out.println(this.name+" stock is reduced by "+ quantity+" remaining stock is "+stock);
    		if(quantity>1) {
    		System.out.println(this.name+" order placed with quantity "+quantity);
    		}
    	}
    	else {
    		System.out.println(this.name+" is not available");
    	}
    }
	@Override
	public void check_stock() {
		
		isProductAvailable();
		
	}
	@Override
	public void update_stock(int quantity) {
	
		reduce_stock(quantity);
	}
}
