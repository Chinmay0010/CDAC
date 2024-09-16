package eample2.org;

public class CompoundInterestCalculator {
	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;
	
	
	// Parameterless constructor
	public CompoundInterestCalculator() {
		
	}
	
	//Parameterize constructor
	
	public CompoundInterestCalculator (double principal,double annualInterestRate, int numberOfCompounds,int years) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
				
	}
	
	public double getPrincipal() {
		return this.principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal= principal;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfCompounds() {
		return this.numberOfCompounds;
	}
	
	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public void setYears(int years) {
		this.years = years;
	}

	
	
	// Method to calculate future value
    public double calculateFutureValue() {
        return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
    }

    // Method to calculate total interest earned
    public double calculateTotalInterest() {
        return calculateFutureValue() - principal;
    }

    @Override
    public String toString() {
        return String.format("Investment Details:\nPrincipal: ₹%.2f\nAnnual Interest Rate: %.2f%%\n" +
                             "Compounds per Year: %d\nInvestment Duration: %d years",
                             principal, annualInterestRate, numberOfCompounds, years);
    }

	
	
}
