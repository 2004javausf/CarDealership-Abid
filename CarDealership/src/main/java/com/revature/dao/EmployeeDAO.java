package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.beans.Employee;

public interface EmployeeDAO {
	
	//Create insertEmployee Method
	public void insertEmployee(String firstName, String lastName, String designation, CharSequence phoneNumber, String email, String userName, String passWord) throws SQLException;
	
	
	public List<Employee> getEmployee() throws SQLException;
}
