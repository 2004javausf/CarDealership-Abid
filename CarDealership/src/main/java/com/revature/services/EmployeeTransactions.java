package com.revature.services;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.daoimpl.EmployeeDAOImpl;
import com.revature.util.LogThis;

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
		LogThis.LogIt("info", carMake + "was sucessfully added to the inventory list. Its set price is "+ carPrice);
		try {
			EmployeeDAOImpl.insertCar(carMake, carModel, carYear, carColor, carStatus, carMileage, carPrice);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void deleteCar() {
		CarDAOImpl carDAOImpl = new CarDAOImpl();
		int carID;
		try {
			carDAOImpl.getCarList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Enter the ID of the Car your want to remove: ");
		carID = in.nextInt();
		System.out.println("\n Car " +carID + " was successfully removed from the inventory. Here is the updated Inventory List");
		LogThis.LogIt("info", "Car" +carID + "was removed");
		try {
			EmployeeDAOImpl.deleteCar(carID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			carDAOImpl.getCarList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("What do you want to do next? ");	
		}	
	}
	
	
	
	
	
	
	

}
