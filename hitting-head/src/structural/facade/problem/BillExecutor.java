package structural.facade.problem;

import structural.facade.solution.Bill;

public class BillExecutor {

	public static void main(String[] args) {

		BillingSystem billingSystem = new BillingSystem();
		Bill bill = billingSystem.createBill(2500);
		CustomerInvoiceSystem customerInvoiceSystem = new CustomerInvoiceSystem();
		customerInvoiceSystem.prepareInvoiceForBill(bill);
	}
}
