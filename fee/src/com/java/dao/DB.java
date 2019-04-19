package com.java.dao;

import java.sql.*;

public class DB {
	public static Connection getCon() {
		Connection con = null;
		try {
			System.out.println("before forname");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("after forname");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "pavani");
		} catch (Exception ex) {
			System.out.println("Catch");
			System.out.println(ex);
		}
		return con;
	}
	public static Connection getCon1() {
		Connection con = null;
		try {
			System.out.println("before forname");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("after forname");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
		} catch (Exception ex) {
			System.out.println("Catch");
			System.out.println(ex);
		}
		return con;
	}
}
