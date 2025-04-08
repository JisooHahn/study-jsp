package com.app.controller.member;

import java.io.IOException;

import com.app.domain.vo.MemberVO;
import com.app.repository.member.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

public class DeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		HttpSession session = req.getSession();
		String path = "/member/join";
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		memberVO.setId(member.getId());
		memberDAO.delete(memberVO.getId());
		req.getSession().invalidate();
		resp.sendRedirect(path);
	}
}
