package behavioral.template;

public class ExpensiveLoan extends LoanCalculationAlgorithm {

	@Override
	public int getBaseAmount() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return 9.5;
	}

	@Override
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
