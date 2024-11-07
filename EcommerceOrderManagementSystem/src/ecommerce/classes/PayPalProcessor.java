package ecommerce.classes;

public class PayPalProcessor implements IPaymentProcessor{

	@Override
	public void process_payment(int amount) {
		System.out.println(amount+" paid by paypal processor");
		
	}

}
