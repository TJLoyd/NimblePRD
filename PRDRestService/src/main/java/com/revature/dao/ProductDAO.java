package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.domain.Products;

public interface ProductDAO {
	
	public abstract void createProduct(String fName, String shortName,
			String dept, String prdType, String type, String desc, boolean isPrototype) throws SQLException;
	
	public abstract List<Products> retrieveAllProducts() throws SQLException;
	
	public abstract Products retrieveProduct(String shortName) throws SQLException;
	
	public abstract void updateProduct() throws SQLException;

}
