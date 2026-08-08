package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession();
		if(session==null)
		{
			System.out.println("Session Expired");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
		}
	}

}
