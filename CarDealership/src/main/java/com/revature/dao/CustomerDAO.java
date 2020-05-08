package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {
	
	//Create insertCusomer Method
	public void insertCustomer(String firstName, String lastName, CharSequence phoneNumber, String email, String userName, String passWord, int creditScore) throws SQLException;

	// Read 
	public List<Customer> getCustomer() throws SQLException;
}
