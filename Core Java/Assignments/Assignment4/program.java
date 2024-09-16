package example4.org;

import java.util.Scanner;
public class program {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            DiscountCalculatorUtil.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DiscountCalculatorUtil.acceptRecord(scanner);
                    break;
                case 2:
                    DiscountCalculatorUtil.printRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();

    }
}
