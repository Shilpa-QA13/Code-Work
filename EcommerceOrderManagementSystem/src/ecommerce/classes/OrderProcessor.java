package ecommerce.classes;

public class OrderProcessor {
	IPaymentProcessor p;
	public void process_order(Order order,String payment_type,int quantity,int amount,Product pro) {
		if(payment_type=="credit card") {
	    p=new CreditCardProcessor();
	 }else if(payment_type=="pay pal") {
		p=new PayPalProcessor();	
		}
		order.place_order(pro,quantity);
		p.process_payment(amount);
		System.out.println("The order is processed for the product "+pro.name+" of quanity "+quantity+" with the payment type "+payment_type+" by paying an amount "+amount);
	}
public static void main(String[] args) {
	Product p1=new Product("TV",35000,30);
	Product p2=new Product("Refrigerator",48000,20);
	Product p3=new Product("Washing machine",60000,15);
	Order o=new Order();
	OrderProcessor op=new OrderProcessor();
	op.process_order(o,"credit card",25,35000,p1);
	InvoiceGenerator ig=new InvoiceGenerator();
	ig.generate_invoice(o,p1);
}

}
