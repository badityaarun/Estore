package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.bean.CustomerBean;
import com.estore.dao.CustomerRegistrationDAO;
@WebServlet("/register")
public class CustomerRegistrationServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		CustomerBean cb=new CustomerBean();
		cb.setUname(req.getParameter("uname"));
		cb.setUpass(req.getParameter("upass"));
		cb.setFname(req.getParameter("fname"));
		cb.setLname(req.getParameter("lname"));
		cb.setAddr(req.getParameter("addr"));
		cb.setEmail(req.getParameter("email"));
		cb.setMobile(req.getParameter("mobile"));
		
		CustomerRegistrationDAO crdao=new CustomerRegistrationDAO();
		int rowCount=crdao.insertData(cb);
		if(rowCount>0)
		{
			req.setAttribute("data", "User Registration Scuccessfully!!");
			req.getRequestDispatcher("CustomerRegistration.jsp").forward(req, res);
			
		}
		else
		{
			req.setAttribute("data", "User Registration Failed!!");
			req.getRequestDispatcher("CustomerRegistration.jsp").forward(req, res);
		}
		
	}
}
