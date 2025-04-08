package com.app.ex.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("ex04.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String region = req.getParameter("region");
		String result = "";
		
//		if(region.equals("경기도")) {
//			result = "남양주시";
//			System.out.println("남양주시");
//		} else if(region.equals("서울")) {
//			result = "강남구";
//			System.out.println("강남구");
//		} else {
//			result = "결과 없음";
//			System.out.println("결과 없음");
//		}
		
//		req.setAttribute("result", result);
//		req.getRequestDispatcher("ex04-result.jsp").forward(req, resp);
		
		resp.sendRedirect(region.equals("경기도") ? "ex04-nam" : "ex04-gang");
	}
		

	}
}
