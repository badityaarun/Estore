package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.estore.bean.ProductBean;

public class UpdateProductDAO {
	
	public int updateProduct(ProductBean pb)
	{
		int rowCount = 0;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("UPDATE product SET pprice=?, pqnt=pqnt+? WHERE pcode=?");
			pstmt.setString(1, pb.getPprice());
			pstmt.setString(2, pb.getPqnt());
			pstmt.setString(3, pb.getPcode());
			rowCount=pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
