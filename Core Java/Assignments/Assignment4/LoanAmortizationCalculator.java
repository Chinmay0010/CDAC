package example1.org;

public class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;  // in years
    
    
    
    public LoanAmortizationCalculator() {
    	
    }

    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Method to calculate the monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // Method to calculate the total payment over the loan term
    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }

    @Override
    public String toString() {
        return String.format("Loan Details:\nPrincipal: ₹%.2f\nAnnual Interest Rate: %.2f%%\nLoan Term: %d years",
                principal, annualInterestRate, loanTerm);
    }
}
