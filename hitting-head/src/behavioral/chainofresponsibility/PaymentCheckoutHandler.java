package behavioral.chainofresponsibility;

public class PaymentCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment information...");
		if (nextHandler != null) {
			nextHandler.handleCheckout();
		}
	}

}
