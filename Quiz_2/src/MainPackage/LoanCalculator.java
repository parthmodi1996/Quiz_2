package MainPackage;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class LoanCalculator {
	//Create variables to take values//
	private double repayment_APR;
	private int years;
	private double initial_cost;
	private double percentage_increase;
	
	//Create constructor//
	public LoanCalculator(double repayment_APR, int years, double initial_cost, double percentage_increase) {
		this.repayment_APR = repayment_APR;
		this.years = years;
		this.initial_cost = initial_cost;
		this.percentage_increase = percentage_increase;
	}
	
	//Create getters for private variables//
	/**
	 * Getter value for the variable repayment_APR
	 */
	protected double getRepayment_APR() {
		return repayment_APR;
	}
	/**
	 * Getter value for the variable years
	 */
	protected int getYears() {
		return years;
	}
	/**
	 * Getter value for varaible initial_cost
	 */
	protected double getInitial_cost() {
		return initial_cost;
	}
	/**
	 * Getter value for varaible percentage_increase
	 */
	protected double getPercentage_increase() {
		return percentage_increase;
	}
	/**
	 * This method calculates and returns the value of the tuition rate after 4 years of college.
	 */
	protected double final_value() {
		double value = getInitial_cost();
		for (int i = 0; i < 4; i++) {
			value += (int) (getPercentage_increase() / (100) * value);
		}
		return value;
	}
	
	/**
	 * This method calculates and returns the monthly payment of the loan using FinanceLib library.
	 */
	protected double monthly_payment() {
		double r = getRepayment_APR() / (12 * 100);
		double n = getYears() * 12;
		double PMT = FinanceLib.pmt(r, n, getInitial_cost(), 0, true);
		return PMT;
	}
	/**
	 * This method calculates and returns the total amount to be paid using FinanceLib library.
	 */
	protected double total_payment() {
		double r = getRepayment_APR() / (12 * 100);
		double n = getYears() * 12;
		double FV = FinanceLib.fv(r, n, monthly_payment(), 0, true);
		return FV;
	}
}
