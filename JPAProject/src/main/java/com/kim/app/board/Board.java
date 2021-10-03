package com.kim.app.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity // 테이블과 매핑시킬 클래스입니다!
@Table(name="BOARD") // 생략가능. name속성의 값과 테이블을 매핑처리
public class Board{

	@Id // 엔티티클래스의 필수 요소. PK와 매핑
	@GeneratedValue // @Id을 선언한 멤버변수-필드-속성에 PK를 자동으로 할당
	private int id;
	private String title;
	private String writer;
	private String content;
	@Temporal(TemporalType.DATE) // 시간,날짜와 관련된 타입 변수 매핑시에 이용
	private Date wdate;
	private int cnt;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String toString() {
		return "BoardVO: "+id+" "+title;
	}

}
