package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.MonthlyPayment;

public interface MonthlyPaymentDAO {
	
	public void insertMonthlyPayment(int monthlyPaymentID, long interestRate, int numberOfMonth, long monthlyFee, int carPaymentID,
			String monthlyPaymentDate) throws SQLException;
	
	public List<MonthlyPayment> getMonthlyPaymentList() throws SQLException; 

}
