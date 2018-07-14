package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Product;

public interface ProductDAO {
	
	public abstract void createProduct(String pFName, String pShortName,
			String pDept, String pType, String pDesc) throws SQLException;
	
	public abstract Product retrieveProduct() throws SQLException;
	
	public abstract void updateProduct() throws SQLException;

}
