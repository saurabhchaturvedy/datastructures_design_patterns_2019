package structural.facade.problem;

import structural.facade.solution.Bill;

public class CustomerInvoiceSystem {

	public void prepareInvoiceForBill(Bill bill) {
		System.out.println("Request for payment for the sum of Rs: " + bill.getAmount());
	}
}
