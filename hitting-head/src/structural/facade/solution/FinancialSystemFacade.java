package structural.facade.solution;

public class FinancialSystemFacade {

	BillingSystem billingSystem;
	CustomerInvoiceSystem customerInvoiceSystem;

	public void prepareInvoiceForBill(int amount) {
		Bill bill = billingSystem.createBill(amount);
		customerInvoiceSystem.prepareInvoiceForBill(bill);
	}

	public void setBillingSystem(BillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}

	public void setCustomerInvoiceSystem(CustomerInvoiceSystem customerInvoiceSystem) {
		this.customerInvoiceSystem = customerInvoiceSystem;
	}
}
