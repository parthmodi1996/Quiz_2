package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanTest {

	@Test
	/**
	 * This is a test method to perform JUnit test to calculate monthly and total payment
	 */
	public void test() {
		//Set the values of variables to perform test// 
		double repayment_APR = 6;
		int years = 5;
		double initial_cost = 12520;
		double percentage_increase = 4;		
		//Create instance of LoanCalculator constructor// 
		LoanCalculator myLoan = new LoanCalculator(repayment_APR, years, initial_cost, percentage_increase);
		double monthly = (double)Math.round(myLoan.monthly_payment() * 100d) / 100d;
		double total = (double)Math.round(myLoan.total_payment() * 100d) / 100d;
		//Perform test using assertTrue method//
		assertTrue("Test for Monthly Payment", monthly ==  -240.84);
		assertTrue("Test for Total Payment", total == 16887.6);		
	}
}
