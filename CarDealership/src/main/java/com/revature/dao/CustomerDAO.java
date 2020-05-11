package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {
	
	//Create insertCusomer Method
	public void insertCustomers(String firstName, String lastName, String phoneNumber, String creditScore, String email, String userName, 
			String passWord, String userType) throws SQLException;
	// Read 
	public List<Customer> getCustomerList() throws SQLException;
}
