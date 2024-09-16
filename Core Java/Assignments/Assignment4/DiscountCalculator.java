package example4.org;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    // Constructor
    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
        calculateDiscount(); 
    }

    
    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    //logic to calculate discount and final price
    private void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    @Override
    public String toString() {
        return String.format("Original Price: ₹%.2f\nDiscount Rate: %.2f%%\nDiscount Amount: ₹%.2f\nFinal Price: ₹%.2f",
                originalPrice, discountRate, discountAmount, finalPrice);
    }
}