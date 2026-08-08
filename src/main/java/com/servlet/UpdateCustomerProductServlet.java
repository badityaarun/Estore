package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estore.dao.UpdateproductServletDAO;

@WebServlet("/qntreq")
public class UpdateCustomerProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if (session == null) {

			System.out.println("Session Expired!!");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);

		} else {

			Integer qnt = Integer.parseInt(req.getParameter("pqnt"));
			Integer price = Integer.parseInt(req.getParameter("pprice"));
			Integer reqqnt = Integer.parseInt(req.getParameter("reqno"));

			if (reqqnt <= qnt) {

				int remainingQnt = qnt - reqqnt;

				String pcode = req.getParameter("pcode");

				int rowCount = new UpdateproductServletDAO()
						.updateQuantity(String.valueOf(remainingQnt), pcode);

				if (rowCount > 0) {

					int total = price * reqqnt;

					req.setAttribute("total", total);

				} else {

					req.setAttribute("total", "Database Update Failed!!");
				}

			} else {

				req.setAttribute("total", "Order Not Placed!!");
			}

			req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
		}
	}
}