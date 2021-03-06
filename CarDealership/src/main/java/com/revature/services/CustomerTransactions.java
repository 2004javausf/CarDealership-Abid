package com.revature.services;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.UserInfo;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.daoimpl.UserInfoDAOImpl;
import com.revature.driver.Menu;
import com.revature.util.LogThis;

public class CustomerTransactions {
	static Scanner st = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	
	public static  void customerRegistration() {
		CustomerDAOImpl customerDAOImpl= new CustomerDAOImpl();
		boolean uniqueUsername;
		boolean uniqueEmail;
		String userName; 
		String email;
		String phoneNumber;
		String creditScore;

		System.out.print("First Name: ");
		String firstName = st.nextLine();
		System.out.print("Last Name: ");
		String lastName = st.nextLine();
		
		do {
			System.out.print("Phone Number: ");
			phoneNumber = st.nextLine();
			} while(UserInfoDAOImpl.validatePhone(phoneNumber)==false);
		
		do {
			System.out.print("Credit Score: ");
			creditScore = in.nextLine();
			} while(CustomerDAOImpl.validateCreditScore(creditScore)==false);
			
		do {
			do {
			System.out.print("Email: ");
			email = st.nextLine();
			} while (UserInfoDAOImpl.validateEmail(email)==false);
			uniqueEmail = UserInfoDAOImpl.checkUniqueEmail(email);
			} while(uniqueEmail == false);
		
	
		do {
			System.out.print("Enter your intended username: ");
			userName = st.nextLine();
			uniqueUsername = UserInfoDAOImpl.checkUniqueUser(userName);
			} while(uniqueUsername == false);
			System.out.print("Enter your password: ");
			String passWord = st.nextLine();
			String userType = "Customer";
			System.out.println("Thank you for your registration!");
			LogThis.LogIt("info", userName + " was successfully created");
		try {
			customerDAOImpl.insertCustomers(firstName, lastName, phoneNumber, creditScore, email, userName, passWord, userType);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void customerTranscation() {
		CarDAOImpl carDAOImpl = new CarDAOImpl();
		int menuSelection = 0;
		do {
			System.out.print("What do you want to do? " + "\n1. View our Inventory" + "\n2. Make an Offer" + "\n3. View your own car" 
										+ "\n4. Payment" + "\n5. Go Back" + "\n6. Exit" + "\nPlease enter your choice: ");
			menuSelection = in.nextInt();
			switch(menuSelection) {
				case 1: 
				try {
					carDAOImpl.getCarList();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 2: 
					makeOffer();
					break;
				case 3: 
					// view the own car
					break;
				case 4: 
					//Payment
					break;
				case 5:
					Menu.customerMenu();
					break;
				case 6:
					System.out.println("Thank you for visitng us! Good Bye");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid entry! Please Enter again");
					customerTranscation();
					break;		
			}
		}while(menuSelection != 4);		
	}
	
	public static void makeOffer() {
		CarDAOImpl carDAOImpl = new CarDAOImpl();
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		System.out.println("Welcome to DreamWorld Auto Inventory! Thank for your time\n");
		try {
			carDAOImpl.getCarList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("\nPlease enter the ID of the car you want make offer:  ");
		int carId = in.nextInt();
		System.out.print("How much do you want to make offer for your preffered vehicle:  ");
		long offerPrice = in.nextLong();
		System.out.print("Thank you so much. Please now enter your Customer ID: ");
		int customerId = in.nextInt();
		try {
			customerDAOImpl.makeOffer(carId, customerId, offerPrice);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("You offered has been process successfully");	
		LogThis.LogIt( "info", " You successfully made offer for " + "carID " + carId);
	}
}
