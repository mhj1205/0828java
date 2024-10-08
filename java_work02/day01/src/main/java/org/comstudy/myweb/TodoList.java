package org.comstudy.myweb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.myweb.model.TodoVo;

@WebServlet("/todo/list")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ArrayList<TodoVo> todoList = new ArrayList<TodoVo>();
    	todoList.add(new TodoVo(101,"새 할일111", false));
    	todoList.add(new TodoVo(102,"새 할일211", false));
    	todoList.add(new TodoVo(103,"새 할일311", false));
    	req.setAttribute("todoList", todoList);
    	
    	// TodoList.jap페이지로 forward 하기
		String path = "/WEB-INF/views/TodoList.jsp";
		RequestDispatcher view = req.getRequestDispatcher(path);
		view.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
