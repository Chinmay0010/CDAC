package eample2.org;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	Scanner sc = new Scanner(System.in);
	
	private CompoundInterestCalculator compoundInterestCalculator;
	
	public void acceptRecord() {
		System.out.println("Enter initial investment amount (in ₹) ");
		double principal = sc.nextDouble();
		System.out.println("Enter annual interest rate (in %) ");
		double annualInterestRate = sc.nextDouble();
	    System.out.print("Enter Number of Compounds per Year: ");
	    int numberOfCompounds = sc.nextInt();
	    System.out.print("Enter Investment Duration (in years): ");
	    int years = sc.nextInt();
	    
	    compoundInterestCalculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
			
	}
	
	public void printRecord() {
		System.out.println(compoundInterestCalculator);  // Display investment details
        double futureValue = compoundInterestCalculator.calculateFutureValue();
        double totalInterest = compoundInterestCalculator.calculateTotalInterest();
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
		
	}
	
	 public void menuList() {
	        System.out.println("1. Enter Investment Details");
	        System.out.println("2. Display Future Value and Total Interest");
	        System.out.println("3. Exit");
	    }
}
