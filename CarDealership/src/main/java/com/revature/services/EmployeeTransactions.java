package com.revature.services;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.EmployeeDAOImpl;

public class EmployeeTransactions {
	static Scanner st = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	
	public static void insertCar() {
		System.out.print("Car Make: ");
		String carMake = st.nextLine();
		System.out.print("Car Model: ");
		String carModel = st.nextLine();
		System.out.print("Car Year: ");
		int carYear = in.nextInt();
		System.out.print("Car Color: ");
		String carColor = st.nextLine();
		System.out.print("Car Status: ");
		String carStatus = st.nextLine();
		System.out.print("Car Mileage: ");
		long carMileage = in.nextLong();
		System.out.print("Car Price: ");
		long carPrice = in.nextLong();
		System.out.println("Vehicle is successfully added to the DreamWorld Auto Inventory");
		try {
			EmployeeDAOImpl.insertCar(carMake, carModel, carYear, carColor, carStatus, carMileage, carPrice);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	

}
