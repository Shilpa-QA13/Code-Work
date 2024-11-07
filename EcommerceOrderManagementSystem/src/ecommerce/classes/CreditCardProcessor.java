package ecommerce.classes;

public class CreditCardProcessor implements IPaymentProcessor {

	@Override
	public void process_payment(int amount) {
	System.out.println(amount+" paid by credit card processor");
		
	}

}
