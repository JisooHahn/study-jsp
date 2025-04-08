package com.app.ex.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex03 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("ex03.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("fruit-name");
		String price = req.getParameter("fruit-price");
		
		req.setAttribute("fruit", name + "은(는) " + price + "원입니다");
		
		req.getRequestDispatcher("ex03-result.jsp").forward(req, resp);
	}
}
