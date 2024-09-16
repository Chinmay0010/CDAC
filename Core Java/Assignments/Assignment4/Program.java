package eample2.org;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
		Scanner sc = new Scanner(System.in);

		int choice;
		
		 do {
	            util.menuList();
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    util.acceptRecord();   // Accept investment details from user
	                    break;
	                case 2:
	                    util.printRecord();    // Display future value and total interest
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	    
	        } while (choice != 3);  // Repeat menu until user selects "Exit"
	        sc.close();      
	}

}
