package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

public interface CarPaymentDAO {
	
	public void insterCarPayment(int carPaymentID, long downPayment, long loanAmount, int carOfferedID, String carSoldDate) throws SQLException;
	
	public List<CarPaymentDAO> getCarPaymentList() throws SQLException;
}
