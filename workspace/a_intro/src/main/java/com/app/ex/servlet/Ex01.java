package com.app.ex.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		사용자가 get 요청을 보내면 /ex01.jsp 페이지로 요청을 포워딩(서블릿을 통해 해당 페이지로 이동하도록 함)
		req.getRequestDispatcher("/ex01.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		name 이라는 파라미터 값(폼에서 전달된 데이터)을 가져옴
		String name = req.getParameter("name");
//		name + "님"으로 변환 후 request 속성에 저장
//		request: 클라이언트(브라우저)가 서버(서블릿)으로 요청을 보낼 때 사용되는 객체
		req.setAttribute("name", name + "님");
//		/result.jsp로 요청을 포워딩하여 결과를 보여줌
//		response: 서버(서블릿)가 클라이언트(브라우저)에게 응답을 보낼 때 사용되는 객체
		req.getRequestDispatcher("/result.jsp").forward(req, resp);
	}
}
