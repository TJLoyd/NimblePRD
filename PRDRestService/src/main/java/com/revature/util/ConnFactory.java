//package com.revature.util;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//import javax.servlet.ServletContext;
//
//public class ConnFactory {
//	// Create an instance
//	private static ConnFactory cf = new ConnFactory();
//
//	// Create a private constructor
//
//	private ConnFactory() {
//		super();
//	}
//
//	// Create a private 
//	public static synchronized ConnFactory getInstance() {
//		if (cf == null) {
//			cf = new ConnFactory();
//		}
//		return cf;
//	}
//	
//	public Connection getConnection() {
//		Connection conn = null;
//		
//		try {
//			InputStream input = sc.getResourceAsStream("/WEB-INF/database.properties");
//			Properties prop = new Properties();
//			prop.load(input);
//			Class.forName("oracle.jdbc.OracleDriver");
//			conn = DriverManager.getConnection(
//					prop.getProperty("url"),
//					prop.getProperty("usr"), 
//					prop.getProperty("password"));
//			System.out.println("Loading... Please wait.");
//        } catch (Exception x) {
//            System.out.println("Error caught at connecting to database: " + x.getMessage());
//        }
//		
//		return conn;
//	}
//	
//}
