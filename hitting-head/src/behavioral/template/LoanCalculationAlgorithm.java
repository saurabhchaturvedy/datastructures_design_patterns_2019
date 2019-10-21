package behavioral.template;

public abstract class LoanCalculationAlgorithm {

	public int calculateLoan() {
		return (int) (getBaseAmount() * getInterest() - getDiscount());
	}

	public abstract int getBaseAmount();

	public abstract double getInterest();

	public abstract int getDiscount();
}
