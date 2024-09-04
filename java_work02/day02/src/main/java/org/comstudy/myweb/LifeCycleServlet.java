package org.comstudy.myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	
	public LifeCycleServlet() {
		System.out.println("1. 생성자() = LifeCycleServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3. service() = LifeCycleServlet");
	}

	@Override
	public void destroy() {
		System.out.println("4. destroy() = LifeCycleServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("2. init() = LifeCycleServlet");
	}

	
}
