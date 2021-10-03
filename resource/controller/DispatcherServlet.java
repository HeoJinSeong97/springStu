package com.heo.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.heo.app.board.BoardVO;
import com.heo.app.board.impl.BoardDAO;
import com.heo.app.user.UserVO;
import com.heo.app.user.Impl.UserDAO;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HandelerMapping handelerMapping;
    private ViewResolver viewResolver;
	
//    ���� ��ü�� ������ �� �ڵ� �����
    public void init() {
    	System.out.println("initüũ");
		handelerMapping = new HandelerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("/spring/");
		viewResolver.setSuffix(".jsp");
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doAction(request, response);
	}
	
	/*
	 * ����� �Է� ������ ���͸�
	 * 1�� ������ ����
	 * DB����
	 * ȭ�� ��ȯ
	 */
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String com = uri.substring(uri.lastIndexOf("/"));
		System.out.println(com);
		RequestDispatcher rd;
		Controller controller = handelerMapping.getController(com);
//		��Ʈ�ѷ� ��ü �˻�
		String view = controller.doAction(request, response);
//		��Ʈ�ѷ��� ����ǰ��� �̵��� ������ ��ΰ� ��ȯ��
		if (view.contains(".do")) {
			System.out.println("��");
			response.sendRedirect(view);
		} else {
//			.do�� ���ٸ�
			System.out.println("����");
//			rd = request.getRequestDispatcher(viewResolver.getView(view));
//	 		rd.forward(request, response);
			response.sendRedirect(viewResolver.getView(view));
		}
		/*
		 * 1. Ŭ���̾�Ʈ ��û
		 * com ���� -> ��Ʈ�ѷ� �˻�
		 * ��Ʈ�ѷ��� ������ ó���� �� ������ ��θ� ��ȯ
		 * ������ ��� �м�
		 * 
		 * */
		
	}

}
