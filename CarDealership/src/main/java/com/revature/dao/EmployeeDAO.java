package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.beans.Employee;

public interface EmployeeDAO {
	
	//Create insertEmployee Method
	public void insertEmployee(int employeeID, String firstName, String lastName, String designation, CharSequence phoneNumber,
			int userInfoID) throws SQLException;
	
	
	public List<Employee> getEmployeeList() throws SQLException;
	
	
}
