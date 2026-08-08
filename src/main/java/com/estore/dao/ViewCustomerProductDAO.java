package com.estore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.estore.bean.ProductBean;

public class ViewCustomerProductDAO {
	
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieveData()
	{
		try {
			Connection con=DBConnect.getConnect();
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM product");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				ProductBean pb=new ProductBean();
				pb.setPcode(rs.getString(1));
				pb.setPname(rs.getString(2));
				pb.setPcompany(rs.getString(3));
				pb.setPprice(rs.getString(4));
				pb.setPqnt(rs.getString(5));
				al.add(pb);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
	}
}
