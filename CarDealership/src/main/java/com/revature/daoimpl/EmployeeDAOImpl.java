package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.CarOffered;
import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.util.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void insertEmployee(int employeeID, String firstName, String lastName, String designation,
			CharSequence phoneNumber, int userInfoID) throws SQLException {
		// TODO Auto-generated method stub	
	}
	@Override
	public List<Employee> getEmployeeList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void insertCar(String carMake, String carModel, int carYear, String carColor, String carStatus,
			long carMileage, long carPrice) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = " {CALL CARPRO(?,?,?,?,?,?,?)";
		CallableStatement stmt = conn.prepareCall(sql);
		stmt.setString(1, carMake);
		stmt.setString(2, carModel);
		stmt.setInt(3, carYear);
		stmt.setString(4, carColor);
		stmt.setString(5, carStatus);
		stmt.setLong(6, carMileage);
		stmt.setLong(7, carPrice);
		stmt.execute();	
	}
	
	public static void deleteCar(int carID) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = " {CALL DELETECAR(?)";
		CallableStatement stmt = conn.prepareCall(sql);
		stmt.setInt(1, carID);
		stmt.execute();
	}
	
	public static void deleteOffered(int carOfferedID) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = " {CALL DELETEOFFER(?) ";
		CallableStatement stmt = conn.prepareCall(sql);
		stmt.setInt(1, carOfferedID);
		stmt.execute();
		
	}
	
	public static List<CarOffered> getCarOfferedList() throws SQLException{
		Scanner in = new Scanner(System.in);
		List<CarOffered> carOfferedList = new ArrayList<CarOffered>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR_OFFERED");
		CarOffered carOffered = null;
		while(rs.next()) {
			carOffered = new CarOffered(rs.getInt(1), rs.getLong(2), rs.getString(3), rs.getString(4));
			carOfferedList.add(carOffered);
		}
		for(int i=0; i < carOfferedList.size(); i++) {
			System.out.println(carOfferedList.get(i));
			System.out.print("Do you want to accept this offer? " + "\n1. Yes" + "\n2. No" + "\nPlease Enter your choice: ");
			int menuSelection = in.nextInt();
			switch(menuSelection) {
			case 1: 
				//
				break;
			case 2:
				System.out.print("Enter the CarOffered Id: ");
				int carOfferedID = in.nextInt();
				EmployeeDAOImpl.deleteOffered(carOfferedID);
				System.out.println("Car Offered ID " + carOfferedID + " was rejected and removed successfully ");
				break;
			default:
				System.out.println("Invalid Entry");
				getCarOfferedList();
				break;
			}	
		}
		return carOfferedList;
	}	
	
	public static void main(String[] args) {
		try {
			getCarOfferedList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
