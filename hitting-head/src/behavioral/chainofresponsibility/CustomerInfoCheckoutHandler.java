package behavioral.chainofresponsibility;

public class CustomerInfoCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		// TODO Auto-generated method stub
		System.out.println("Processing customer information...");
		if (nextHandler != null) {
			nextHandler.handleCheckout();
		}
	}

}
