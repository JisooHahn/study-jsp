package com.app.ex.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex02Result extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sum = req.getParameter("sum");
		req.setAttribute("sum", sum);
		req.getRequestDispatcher("ex02-result.jsp").forward(req, resp);
	}
}
