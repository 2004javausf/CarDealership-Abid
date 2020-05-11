package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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

}
