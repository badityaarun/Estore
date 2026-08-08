package com.estore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection con=null;
	private DBConnect()
	{
		
	}
	static
	{
		try {
			Class.forName(DBinfo.driver);
			con=DriverManager.getConnection(DBinfo.dbUrl,DBinfo.dbUname,DBinfo.dbpwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnect()
	{
		
		return con;
	}
}
