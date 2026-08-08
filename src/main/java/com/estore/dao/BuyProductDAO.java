package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.estore.bean.ProductBean;

public class BuyProductDAO {
	
	public ProductBean showProduct(String pcode)
	{
		ProductBean pb=null;
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM product WHERE pcode=?");
			pstmt.setString(1, pcode);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				pb=new ProductBean();
				pb.setPcode(rs.getString(1));
				pb.setPname(rs.getString(2));
				pb.setPcompany(rs.getString(3));
				pb.setPprice(rs.getString(4));
				pb.setPqnt(rs.getString(5));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pb;
	}
}
