package com.kim.app.board;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BoardServiceClient {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAProject");
		EntityManager em=emf.createEntityManager(); // CRUD 수행

		EntityTransaction tx=em.getTransaction();

		try {
			tx.begin();

			Board board=new Board();
			board.setContent("내용1");
			board.setTitle("제목1");
			board.setWriter("작성자1");

			em.persist(board); // 등록. insert

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}	
	}

}
