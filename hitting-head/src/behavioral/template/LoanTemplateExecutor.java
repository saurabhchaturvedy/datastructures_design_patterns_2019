package behavioral.template;

public class LoanTemplateExecutor {

	public static void main(String[] args) {
		LoanCalculationAlgorithm expensiveLoanTemplate = new ExpensiveLoan();
		System.out.println("Expensive Loan Amount is " + expensiveLoanTemplate.calculateLoan());
		LoanCalculationAlgorithm cheapLoanTemplate = new CheapLoan();
		System.out.println("Cheap Loan Amount is " + cheapLoanTemplate.calculateLoan());
	}
}
