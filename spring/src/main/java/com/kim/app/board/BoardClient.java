package com.kim.app.board;

import java.util.List;

import com.kim.app.board.impl.BoardDAO;
import com.kim.app.users.UsersVO;
import com.kim.app.users.impl.UsersDAO;

public class BoardClient {
	public static void main(String[] args) {

		UsersDAO dao = new UsersDAO();
		UsersVO vo = new UsersVO();
		
		vo.setId("applepie");
		vo.setPassword("applepie");
		vo.setName("사과파이");
//		int res = dao.insertUsers(vo);
//		System.out.println(res);
		
		System.out.println(dao.getUsers(vo));
		
//		BoardDAO boardDAO=new BoardDAO();
//		BoardVO vo=new BoardVO();
//		vo.setId(100);
//		vo.setContent("내용");
//		vo.setTitle("제목");
//		int res = boardDAO.updateBoard(vo);
////		
//		System.out.println(vo);
//		System.out.println(vo.getWriter());
//		
//		boardDAO.deleteBoard(vo);
//		
//		vo.setTitle("가나다라");
//		vo.setWriter("admin");
//		vo.setContent("마바사아자");
//		boardDAO.insertBoard(vo);
//		
//		vo.setSearch("TITLE");
//		vo.setSearchContent("a");
//		List<BoardVO> datas=boardDAO.getBoardList(vo);
//		System.out.println("게시글리스트");
//		for(BoardVO data:datas) {
//			System.out.println(data);
//		}

		/*
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");

		ProductService ps=(ProductService)factory.getBean("ProductService");

		ProductVO vo=new ProductVO();
		vo.setId(2);
		vo.setName("����");
		vo.setPrice(45000);

		ps.updateProduct(vo);

		List<ProductVO> datas=ps.getProductList(vo);
		for(ProductVO v:datas) {
			System.out.println(v);
		}


		BoardService bs=(BoardService)factory.getBean("BoardService");
		BoardVO vo=new BoardVO();
		//vo.setId(100);
		vo.setContent("Ʈ�����");
		vo.setTitle("tx");
		vo.setWriter("�ǽ���");
		bs.insertBoard(vo);

		vo.setId(2);
		BoardVO data=bs.getBoard(vo);
		System.out.println(data);

		vo.setId(3);
		vo.setContent("aaa");
		vo.setTitle("banana");
		bs.updateBoard(vo);

		List<BoardVO> datas=bs.getBoardList(vo);
		for(BoardVO v:datas) {
			System.out.println(v);
		}

		UsersService us=(UsersService)factory.getBean("UsersService");
		UsersVO vo=new UsersVO();
		vo.setId("admin");
		vo.setPassword("1234");
		UsersVO data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}
		System.out.println();
		System.out.println();


		vo.setId("kim");
		vo.setPassword("1234");
		data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}
		System.out.println();
		System.out.println();

		vo.setId("admin");
		vo.setPassword("12345");
		data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}


		factory.close();
		 */
	}
}
