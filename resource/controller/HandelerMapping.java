package com.heo.view.controller;

import java.util.HashMap;
import java.util.Map;

public class HandelerMapping {
	private Map<String, Controller> mapping;
//	��û�� ���� ��Ʈ�ѷ��� ����ó���ؾ���
//	�̵��� ���� ������ �ʿ��ϴ�.
	
	public HandelerMapping() {
		// TODO Auto-generated constructor stub
//		������ : ����������� �ʱ�ȭ�ϴ� �۾�
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
//		��û�� ��Ʈ�ѷ� ����ϴ� �ڵ�
	}
	
	public Controller getController(String com) {
		return mapping.get(com);
//		��û�� �о�鿩�� C�� ��ȯ
	}
}
