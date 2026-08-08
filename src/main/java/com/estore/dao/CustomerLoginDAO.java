package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.estore.bean.CustomerBean;

public class CustomerLoginDAO {
	public CustomerBean checkLogin(String uname, String upass)
	{
		CustomerBean bean=null;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM customer WHERE uname=? AND pword=?");
			pstmt.setString(1, uname);
			pstmt.setString(2, upass);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				bean=new CustomerBean();
				bean.setUname(rs.getString(1));
				bean.setUpass(rs.getString(2));
				bean.setFname(rs.getString(3));
				bean.setLname(rs.getString(4));
				bean.setAddr(rs.getString(5));
				bean.setEmail(rs.getString(6));
				bean.setMobile(rs.getString(7));
				
			}
			else
			{
				System.out.println("Invalid crediantial!!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
}
