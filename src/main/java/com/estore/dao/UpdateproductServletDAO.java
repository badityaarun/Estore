package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateproductServletDAO {

	public int updateQuantity(String pqnt, String pcode)
	{
		int rowCount=0;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("UPDATE product SET pqnt=? WHERE PCODE=?");
			pstmt.setString(1, pqnt);
			pstmt.setString(2, pcode);
			rowCount=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
