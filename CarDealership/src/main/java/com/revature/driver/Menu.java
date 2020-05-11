package com.revature.driver;

import java.util.Scanner;
import com.revature.daoimpl.UserInfoDAOImpl;
import com.revature.services.CustomerTransactions;
import com.revature.services.EmployeeTransactions;

public class Menu {
	static Scanner in = new Scanner(System.in);
	static Scanner st = new Scanner(System.in);

	public static void startMenu() {
		int menuSelection = 0;
		do {
			System.out.print("\nWelcome to DreamWorld Auto" + "\n1. Customer" + "\n2. Employee" + "\n3. Exit"
					+ "\nPlease enter your choice: ");
			menuSelection = in.nextInt();
			switch (menuSelection) {

			case 1:
				customerMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 3:
				System.out.println("Thank you for visitng us! Good Bye");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Entry. Please try again!");
				break;
			}
		} while (menuSelection != 3);
	}

	public static void customerMenu() {
		int menuSelection = 0;
		do {
			System.out.print("\n\nMenu" + "\n1. New Customer" + "\n2. Existing Customer" + "\n3. Go Back " + "\n4. Exit"
					+ "\nPlease enter your choice: ");
			menuSelection = in.nextInt();

			switch (menuSelection) {
			case 1:
				CustomerTransactions.customerRegistration();
				break;
			case 2:
				String userName;
				String passWord;
				String userType;
				do {
				System.out.println("\nPlease Login to your account");
				System.out.print("Enter your Username: ");
				userName = st.nextLine();
				System.out.print("Enter your password: ");
				passWord = st.nextLine();
				userType = "Customer";
				} while(UserInfoDAOImpl.checklogin(userName, passWord, userType) == false);
				CustomerTransactions.customerTranscation();
				break;
			case 3: 
				startMenu();
			case 4: 
				System.out.println("Thank you for visitng us! Good Bye");
				System.exit(0);
				break;	
			default:
				System.out.println("Invalid entry! Please Enter again");
				customerMenu();
				break;
			}
		} while (menuSelection != 4);
	}
	
	public static void employeeMenu() {
		String userName;
		String passWord;
		String userType;
		do {
		System.out.println("\nPlease Login to your account");
		System.out.print("Enter your Username: ");
		userName = st.nextLine();
		System.out.print("Enter your password: ");
		passWord = st.nextLine();
		userType = "Employee";
		} while(UserInfoDAOImpl.checklogin(userName, passWord, userType) == false);
		int menuSelection = 0;
		do {
			System.out.print("\nPlease Enter " + "\n1. Add vehicle to the inventory" + "\n2. Remove a Vehicle from the Inventory" 
											+ "\n3. Accept or Reject a Pending Offer" + "\n4. View all payments" + "\n5. Log Out and Return to the Main Menu"
											+ "\n6. Exit" + "\nPlease select your choice: ");
			menuSelection = in.nextInt();
			switch(menuSelection) {
			case 1:
				EmployeeTransactions.insertCar();
				break;
			case 2:
				// Delete Car Method
				break;
			case 3: 
				//Accept or Reject Method
				break;
			case 4: 
				//View all Payment methods 
				break;
			case 5:
				startMenu();
				break;
			case 6:
				System.out.println("Thank you for visitng us! Good Bye");
				System.exit(0);
			default:
				System.out.println("Invalid Entry. Please try again!");
				break;	
			}
			
		} while(menuSelection != 6);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		startMenu();
	}
	
	
	
}
