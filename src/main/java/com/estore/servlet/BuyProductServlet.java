package com.estore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.bean.ProductBean;
import com.estore.dao.BuyProductDAO;

@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			System.out.println("Session Expired!!");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else
		{
			ProductBean pb=new BuyProductDAO().showProduct(req.getParameter("pcode"));
			session.setAttribute("data", pb);
			req.getRequestDispatcher("BuyProduct.jsp").forward(req, res);
		}
		
		
	}
}
