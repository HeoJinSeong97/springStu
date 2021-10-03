<%@page import="com.heo.finaltest.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="com.heo.finaltest.board.Impl.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>

<form action="index.do" method="post">
	<table width="500">
		<tr align="right">
			<td>
				<select name="search">
					<option value="title">제목</option>
					<option value="writer">작성자</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="searchContent">
				<input type="submit" value="search">
			</td>
		</tr>
	</table>
	
</form>
<table border="1">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>내용</td>
	</tr>
	<c:forEach var="v" items="${datas}">
	<tr>
		<td>${v.id }</td>
		<td>${v.title }</td>
		<td>${v.writer }</td>
		<td>${v.content }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>