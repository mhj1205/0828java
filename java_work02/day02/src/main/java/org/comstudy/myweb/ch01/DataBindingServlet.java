package org.comstudy.myweb.ch01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch01/result.do")
public class DataBindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 세션을 비우는 처리
		req.getSession().invalidate();
		// input.jsp 페이지로 새로 고침
		res.sendRedirect("input.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// input.jsp에서 전달한 파라미터 받기
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.printf("전달 받은 name은 %s이고, email은 %s이다",name, email);
		
		// request에 바인딩
		req.setAttribute("name", name);
		// session에 바인딩 = session을 선언해서 사용
	    HttpSession session = req.getSession();
	    session.setAttribute("email", email);
		
		//forward
		String viewName = "/WEB-INF/views/result.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, res);
	}

}
