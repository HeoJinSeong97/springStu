<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kim.app.board.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>

<h2>상세보기 내용</h2>
<hr>
<form action="updateBoard.do" method="post">
	<input type="hidden" value="${boardData.id}" name="id" />
	<table border="1">
		<tr>
			<td bgcolor="lightblue">글 제목</td>
			<td><input type="text" name="title" value="${boardData.title}"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">작성자</td>
			<td>${boardData.writer}</td>
		</tr>
		<tr>
			<td bgcolor="lightblue">상세 내용</td>
			<td><input type="text" name="content" value="${boardData.content}"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">작성일</td>
			<td>${boardData.wdate}</td>
		</tr>
		<tr>
			<td bgcolor="lightblue">조회수</td>
			<td>${boardData.cnt}</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="글 내용 변경하기" /></td>
		</tr>
	</table>
</form>
<br><br>
<a href="deleteBoard.do?id=${boardData.id}">게시글 삭제하기</a>
<br>
<a href="getBoardList.do">게시글 목록보기</a>

</body>
</html>