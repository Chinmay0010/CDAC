package example4.org;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	private static DiscountCalculator lastRecord;  

    public static void acceptRecord(Scanner scanner) {
        System.out.print("Enter original price: ₹");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountRate = scanner.nextDouble();

        lastRecord = new DiscountCalculator(originalPrice, discountRate);  // Create new record

        System.out.println("Discount calculation completed!");
    }

    public static void printRecord() {
    	System.out.println(lastRecord);  // Use toString() of DiscountCalculator
    }
    // Method to display menu options
    public static void menuList() {
        System.out.println("Discount Calculator Menu:");
        System.out.println("1. Calculate Discount");
        System.out.println("2. Display Last Discount");
        System.out.println("3. Exit");
    }
}