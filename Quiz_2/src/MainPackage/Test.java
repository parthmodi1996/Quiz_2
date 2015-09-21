package MainPackage;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//Generate Scanner input variable//
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for annual interest rate//
		System.out.print("Enter percentage annual interest rate: ");
		double repayment_APR = input.nextDouble();
		
		//Prompt the user for total term for loan payment//
		System.out.print("Enter the term for loan payment in years: ");
		int years = input.nextInt();
		
		//Prompt the user for initial cost//
		System.out.print("Enter the current tuition rate: ");
		double initial_cost = input.nextDouble();
		
		//Prompt the user for percentage increase in tuition rate//
		System.out.print("Enter the percentage increase in tuition rate: ");
		double percentage_increase = input.nextDouble();
		
		//Instantiate constructor LoanCalculator to calculate the values of monthly payment and total payment//
		LoanCalculator myLoan = new LoanCalculator(repayment_APR, years, initial_cost, percentage_increase);
		System.out.printf("The monthly payment is $%.2f, and the total payment is $%.2f", (-1)*myLoan.monthly_payment(), myLoan.total_payment());
	}
}
