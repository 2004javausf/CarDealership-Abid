package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.util.ConnFactory;

public class CustomerDAOImpl implements CustomerDAO {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void insertCustomers(String firstName, String lastName, String phoneNumber, String creditScore,
			String email, String userName, String passWord, String userType) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{ CALL CUSTOMERPRO(?,?,?,?,?,?,?,?)";
		CallableStatement stmt = conn.prepareCall(sql);
		stmt.setString(1, firstName);
		stmt.setString(2, lastName);
		stmt.setString(3, phoneNumber);
		stmt.setString(4, creditScore);
		stmt.setString(5, email);
		stmt.setString(6, userName);
		stmt.setString(7,  passWord);
		stmt.setString(8, userType);
		stmt.execute();
	}
	
	public static boolean validateCreditScore(String creditscore) {
		try {
			Integer.parseInt(creditscore);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println(creditscore + " is  not a valid number");
			return false;
		}
			
	}
	
	@Override
	public List<Customer> getCustomerList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	

	
	

}
