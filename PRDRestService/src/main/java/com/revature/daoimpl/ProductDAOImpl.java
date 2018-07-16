package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.ProductDAO;
import com.revature.domain.Products;
import com.revature.util.ConnFactory;

public class ProductDAOImpl implements ProductDAO {
	
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createProduct(String fName, String shortName, String dept,
			String type, String desc) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{call CREATE_PRODUCT(?,?,?,?,?)";
		
		CallableStatement call = conn.prepareCall(sql);
		call.setString(1, fName);
		call.setString(2, shortName);
		call.setString(3, dept);
		call.setString(4, type);
		call.setString(5, desc);
		call.execute();
		
		conn.close();
	}

	@Override
	public List<Products> retrieveAllProducts() throws SQLException {
		List<Products> allProducts = new ArrayList<Products>();
		
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCT");
		
		Products product = null;
		while(rs.next()) {
			product = new Products(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6));
			allProducts.add(product);
		}
		
		conn.close();
		return allProducts;
	}

	@Override
	public Products retrieveProduct(String shortName) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTSHORTNAME = '?'";
		
		ResultSet rs = null;
		Products product = null;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, shortName);
		rs = ps.executeQuery();
		
		if (rs.next()) {
			product = new Products(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6));
			
			conn.close();
			return product;
		}
		
		return null;
	}

	@Override
	public void updateProduct() throws SQLException {
		// TODO Auto-generated method stub

	}

}
