package structural.facade.solution;

public class BillingFacadeExecutor {

	public static void main(String[] args) {
		BillingSystem billingSystem = new BillingSystem();
		CustomerInvoiceSystem customerInvoiceSystem = new CustomerInvoiceSystem();
		FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
		financialSystemFacade.setBillingSystem(billingSystem);
		financialSystemFacade.setCustomerInvoiceSystem(customerInvoiceSystem);
		financialSystemFacade.prepareInvoiceForBill(3700);
	}
}
