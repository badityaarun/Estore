package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.estore.bean.ProductBean;

public class DeleteProductDAO {
	public int deleteProduct(String pb)
	{
		int rowCount=0;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM product WHERE pcode=?");
			pstmt.setString(1, pb);
			rowCount=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
