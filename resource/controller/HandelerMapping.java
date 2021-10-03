package com.heo.view.controller;

import java.util.HashMap;
import java.util.Map;

public class HandelerMapping {
	private Map<String, Controller> mapping;
//	요청에 따른 컨트롤러를 매핑처리해야함
//	이들의 상위 개념은 필요하다.
	
	public HandelerMapping() {
		// TODO Auto-generated constructor stub
//		생성자 : 멤버변수등을 초기화하는 작업
		mapping = new HashMap<String, Controller>();
		mapping.put("/login.do", new LoginController());
		mapping.put("/getBoardList.do", new BoardListController());
		mapping.put("/regist.do", new RegistController());
		mapping.put("/do_regist.do", new DoRegistController());
		mapping.put("/getUserList.do", new UserListController());
		mapping.put("/getBoard.do", new GetBoardController());
		mapping.put("/boardInsert.do", new InsertBoardController());
		mapping.put("/boardDelete.do", new DeleteBoard());
		mapping.put("/boardUpdate.do", new UpdateBoard());
//		요청과 컨트롤러 등록하는 코드
	}
	
	public Controller getController(String com) {
		return mapping.get(com);
//		요청을 읽어들여서 C를 반환
	}
}
