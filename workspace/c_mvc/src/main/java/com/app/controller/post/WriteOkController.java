package com.app.controller.post;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PostVO postVO = new PostVO();
		String postTitle = req.getParameter("postTitle");
		String postContent = req.getParameter("postContent");
		Long memberId = ((MemberVO)req.getSession().getAttribute("member")).getId();
		
		postVO.setPostTitle(postTitle);
		postVO.setPostContent(postContent);
		postVO.setMemberId(memberId);
		
		return null;
	}

}
