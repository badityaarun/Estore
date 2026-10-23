package com.estore.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.bean.ProductBean;
import com.estore.dao.UpdateProductDAO;
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			System.out.println("Session Expired!!");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
			String pcode=req.getParameter("pcode");
			
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productBean");
			ProductBean pb=null;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext())
			{
				pb=i.next();
				if(pcode.equals(pb.getPcode()))
				{
					break;
				}
				
			}
			pb.setPprice(req.getParameter("pprice"));
			pb.setPqnt(req.getParameter("pqnt"));
			
			
			int rowCount=new UpdateProductDAO().updateProduct(pb);
			if(rowCount>0)
			{
				req.setAttribute("data", "Record Updated!!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("data", "Record Updation Failed!!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
			
		}
		
	}
}
