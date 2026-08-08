package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.estore.bean.AdminBean;

public class AdminLoginDAO {
	
	
	public AdminBean checkAdminLogin(String username,String password)
	{
		AdminBean abean=null;
		try
		{
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM admin WHERE uname=? and pword=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				abean = new AdminBean(); 
				abean.setUname(rs.getString(1));
				abean.setPword(rs.getString(2));
				abean.setFname(rs.getString(3));
				abean.setLname(rs.getString(4));
				abean.setAddr(rs.getString(5));
				abean.setMid(rs.getString(6));
				abean.setPhno(rs.getString(7));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return abean;
	}
	
}
