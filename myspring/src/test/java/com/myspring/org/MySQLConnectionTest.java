package com.myspring.org;

import java.sql.*;

import org.junit.Test;


public class MySQLConnectionTest {

	private  static  final String DRIVER = "com.mysql.jdbc.Driver";
	private  static  final String URL = "jdbc:mysql://127.0.0.1:3306/spring_board";
	private  static  final String USER = "root";
	private  static  final String PASS = "1234";	
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try{
			Connection con = DriverManager.getConnection(URL , USER, PASS);
			System.out.println(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
