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
	
//    서블릿 객체가 생성될 때 자동 실행됨
    public void init() {
    	System.out.println("init체크");
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
	 * 사용자 입력 데이터 필터링
	 * 1의 데이터 추출
	 * DB연동
	 * 화면 전환
	 */
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String com = uri.substring(uri.lastIndexOf("/"));
		System.out.println(com);
		RequestDispatcher rd;
		Controller controller = handelerMapping.getController(com);
//		컨트롤러 객체 검색
		String view = controller.doAction(request, response);
//		컨트롤러가 수행되고나면 이동할 페이지 경로가 반환됨
		if (view.contains(".do")) {
			System.out.println("참");
			response.sendRedirect(view);
		} else {
//			.do가 없다면
			System.out.println("거짓");
//			rd = request.getRequestDispatcher(viewResolver.getView(view));
//	 		rd.forward(request, response);
			response.sendRedirect(viewResolver.getView(view));
		}
		/*
		 * 1. 클라이언트 요청
		 * com 추출 -> 컨트롤러 검색
		 * 컨트롤러는 로직을 처리한 후 페이지 경로를 반환
		 * 페이지 경로 분석
		 * 
		 * */
		
	}

}
