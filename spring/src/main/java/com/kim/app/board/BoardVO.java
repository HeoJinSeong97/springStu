package com.kim.app.board;

import java.util.Date; // ��

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD) // �θ�-�ڽ� ������Ʈ
public class BoardVO {
	@XmlAttribute // ������Ʈ�� �����Ҽ��ְ��ϴ� �Ӽ����� ����
	private int id;
	private String title;
	private String writer;
	private String content;
	private Date wdate;
	private int cnt;
	@XmlTransient // @JsonIgnore�� ����
	private String search; // �˻���ɼ����, �����̳ʰ� Command��ü�� ����,
	@XmlTransient
	private String searchContent; // ������ ��ü�� ������-setter �ڵ����� ó���ϴ� ���� �̿�!
	@XmlTransient
	private MultipartFile uploadFile;
	
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
	@JsonIgnore
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	@JsonIgnore
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	@JsonIgnore
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	public String toString() {
		return "BoardVO: "+id+" "+title;
	}
}
