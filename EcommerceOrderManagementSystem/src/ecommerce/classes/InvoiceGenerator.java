package ecommerce.classes;

public class InvoiceGenerator {
	public void generate_invoice(Order o,Product p) {
		System.out.println("The invoice is generated for the order"+ o.customer_order(p));
	}

}
