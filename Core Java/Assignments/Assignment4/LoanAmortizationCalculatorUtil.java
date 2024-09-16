package example1.org;


import java.util.Scanner;

 public class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator loanAmortizationCalculator;
    Scanner scanner = new Scanner(System.in);

    // Method to accept loan details from the user
    public void acceptRecord() {
        System.out.print("Enter Loan Principal Amount (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter Loan Term (in years): ");
        int loanTerm = scanner.nextInt();

        loanAmortizationCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    // Method to display loan details and calculated payments
    public void printRecord() {
            System.out.println(loanAmortizationCalculator);  // Display loan details
            double monthlyPayment = loanAmortizationCalculator.calculateMonthlyPayment();
            double totalPayment = loanAmortizationCalculator.calculateTotalPayment();
            System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
            System.out.printf("Total Payment Over %d Years: ₹%.2f\n", loanAmortizationCalculator.getLoanTerm(), totalPayment);
      
    }

    // Method to display the menu options
    public void menuList() {
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Amortization Details");
        System.out.println("3. Exit");
    }
}
