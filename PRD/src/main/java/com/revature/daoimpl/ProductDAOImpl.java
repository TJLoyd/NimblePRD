package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.beans.Product;
import com.revature.dao.ProductDAO;
import com.revature.util.ConnFactory;

public class ProductDAOImpl implements ProductDAO {
	
	public static ConnFactory cf = ConnFactory.getInstance();

	public void createProduct(String pFName, String pShortName, String pDept,
			String pType, String pDesc) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "{call CREATE_PRODUCT(?,?,?,?,?)";
		
		CallableStatement call = conn.prepareCall(sql);
		call.setString(1, pFName);
		call.setString(2, pShortName);
		call.setString(3, pDept);
		call.setString(4, pType);
		call.setString(5, pDesc);
		call.execute();
		conn.close();
	}

	public Product retrieveProduct() throws SQLException {
		return null;
	}

	public void updateProduct() throws SQLException {

	}

}
