package example1.org;

import java.util.Scanner;


public class program{
	public static void main (String[] args) {
	
		LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
				Scanner sc = new Scanner(System.in);
		int choice;
			do {
				util.menuList();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				
				switch (choice) {
				
				case 1:
					util.acceptRecord(); // Accept loan details from user
					break;
				case 2:
					util.printRecord();	// Display calculated loan details
					break;
				case 3:
                    System.out.println("Exiting...");
                    break;
                 default:
                	 System.out.println("Invalid choice, kindly select valid option");
				}  // Repeat menu until user selects "Exit"
				
			}while (choice !=3 );
			sc.close();	
			
	}
	
}
