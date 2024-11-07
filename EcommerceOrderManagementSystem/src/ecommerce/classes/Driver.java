package ecommerce.classes;

public class Driver {
	static Product p1;
	static Product p2;
	static Product p3;
	public static void main(String[] args) {
		 p1=new Product("TV",35000,30);
		 p2=new Product("Refrigerator",48000,20);
		 p3=new Product("Washing machine",60000,15);
		//System.out.println(p1.get_Details());

		Order o=new Order();

		OrderProcessor op=new OrderProcessor();
		op.process_order(o,"credit card",25,35000,p1);
		
		
	}

}
