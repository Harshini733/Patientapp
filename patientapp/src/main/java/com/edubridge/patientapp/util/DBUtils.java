package com.edubridge.patientapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static Connection getConnection() {
		Connection pat = null;
		
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12492";
		user = "root";
		password = "root";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("No driver found");
		}
		
		try {
			pat = DriverManager.getConnection(url, user, password);
			System.out.println("connection created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pat;
	}
}


