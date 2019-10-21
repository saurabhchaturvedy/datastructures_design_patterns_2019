package behavioral.chainofresponsibility;

public class CheckoutHandlerExecutor {

	public static void main(String[] args) {
		PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
		CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();
		paymentCheckoutHandler.setNextHandler(customerInfoCheckoutHandler);
		paymentCheckoutHandler.handleCheckout();
	}
}
