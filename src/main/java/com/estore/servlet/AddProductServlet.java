package com.estore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.bean.ProductBean;
import com.estore.dao.AddProductDAO;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			System.out.println("Session Expired!!");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
			try {
				ProductBean pb=new ProductBean();
				
				pb.setPcode(req.getParameter("pcode"));
				pb.setPname(req.getParameter("pname"));
				pb.setPcompany(req.getParameter("pcomp"));
				pb.setPprice(req.getParameter("pprice"));
				pb.setPqnt(req.getParameter("pqnt"));
				
				int rowCount=new AddProductDAO().insertProduct(pb);
				if(rowCount>0)
				{
					req.setAttribute("msg", "Product Insertion Successfully!!");
					req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
				}
				else
				{
					req.setAttribute("msg", "Product Insertion Failed!!");
					req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
				}
			} catch (Exception e) {
				req.setAttribute("msg", "Duplicate data are not allowed!!!");
				req.getRequestDispatcher("ErrorPage.jsp").forward(req, res);
			}
		}
		
	}
}
