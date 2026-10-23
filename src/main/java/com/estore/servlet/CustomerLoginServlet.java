package com.estore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.bean.CustomerBean;
import com.estore.dao.CustomerLoginDAO;

@WebServlet("/login")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		
		CustomerLoginDAO cldao=new CustomerLoginDAO();
		CustomerBean cbean=cldao.checkLogin(req.getParameter("uname"), req.getParameter("upass"));
		if(cbean==null)
		{
			System.out.println("Login failed");
			req.getRequestDispatcher("CustomerLogin").forward(req, res);
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("customerBean", cbean);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
			
		}
		
		
	}

}
