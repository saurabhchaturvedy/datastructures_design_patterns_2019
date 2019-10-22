package structural.facade.solution;

import structural.facade.solution.Bill;

public class BillingSystem {

	public Bill createBill(int amount) {
		return new Bill(amount);

	}
}
