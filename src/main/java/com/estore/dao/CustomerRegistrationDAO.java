package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.estore.bean.CustomerBean;

public class CustomerRegistrationDAO {
	public int insertData(CustomerBean cb)
	{
		int rowCount=0;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?)");
			pstmt.setString(1, cb.getUname());
			pstmt.setString(2, cb.getUpass());
			pstmt.setString(3, cb.getFname());
			pstmt.setString(4, cb.getLname());
			pstmt.setString(5, cb.getAddr());
			pstmt.setString(6, cb.getEmail());
			pstmt.setString(7, cb.getMobile());
			rowCount=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
