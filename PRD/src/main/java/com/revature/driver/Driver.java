package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.ProductDAOImpl;

public class Driver {

	public static void main(String[] args) throws SQLException {

		ProductDAOImpl pdi = new ProductDAOImpl();
		pdi.createProduct("test product", "test", "test dept", "test type", "test desc");
	}

}
