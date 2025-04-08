package com.app.ex.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/ex02.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
//		System.out.println(num1);
		int num2 = Integer.parseInt(req.getParameter("num2"));
//		System.out.println(num2);
		
		int sum = num1 + num2;
//		System.out.println(sum);
		
		resp.sendRedirect("ex02-result?sum=" + URLEncoder.encode("결과: " + sum, "UTF-8"));
//		System.out.println("sum");
	}
}