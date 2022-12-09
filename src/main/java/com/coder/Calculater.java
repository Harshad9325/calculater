package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculater
 */
@WebServlet("/Calculater")
public class Calculater extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculater() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String opt = req.getParameter("opt");
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		Integer i1 = Integer.parseInt(num1);
		Integer i2 = Integer.parseInt(num2);

		if (opt.equalsIgnoreCase("Add")) {
			int sum = i1 + i2;
		    out.print("sum is="+sum);
		} else {
			if (opt.equalsIgnoreCase("sub")) {
				int sub = i1 - i2;
				out.print("sub is="+sub);
			} else {
				if (opt.equalsIgnoreCase("mul")) {
					int mul = i1 * i2;
					out.print("mul is ="+mul);
				} else {
					if (opt.equalsIgnoreCase("Div")) {
						int Div = i1 / i2;
						out.print("div is="+Div);
					} else {
						out.print("plase select valid option");

						RequestDispatcher rd = req.getRequestDispatcher("/index.html");
					}
				}
			}
		}

	}

}
