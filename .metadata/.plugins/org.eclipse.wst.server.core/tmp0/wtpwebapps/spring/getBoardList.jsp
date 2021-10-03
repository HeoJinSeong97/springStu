<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kim.app.board.BoardVO,java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글목록출력</title>
</head>
<body>
<h1><spring:message code="message.board.getBoardList.title" /></h1>
<hr>
<h2>${userName}<spring:message code="message.board.getBoardList.msg" /></h2>
<br>
<a href="logout.do"><spring:message code="message.board.getBoardList.logout" /></a>
<hr>
<form action="getBoardList.do" method="post">
	<table border="1" width="800">
		<tr>
			<td align="right" bgcolor="pink">
			<select name="search">
			<c:forEach items="${resultMap}" var="o">
			<option value="${o.value}">${o.key}</option>
			</c:forEach>
			</select>
			<input type="text" name="searchContent">
			<input type="submit" value="<spring:message code="message.board.getBoardList.search" />">
			</td>
		</tr>
	</table>
</form>
<table border="1"  width="800">
	<tr>
		<th bgcolor="pink"><spring:message code="message.board.getBoardList.bnum" /></th>
		<th bgcolor="pink"><spring:message code="message.board.getBoardList.btitle" /></th>
		<th bgcolor="pink"><spring:message code="message.board.getBoardList.bwriter" /></th>
		<th bgcolor="pink"><spring:message code="message.board.getBoardList.bdate" /></th>
		<th bgcolor="pink"><spring:message code="message.board.getBoardList.bcnt" /></th>
	</tr>
	<c:forEach items="${boardList}" var="v">
		<tr>
			<td>${v.id}</td>
			<td><a href="getBoard.do?id=${v.id}">${v.title}</a></td>
			<td>${v.writer}</td>
			<td><fmt:formatDate value="${v.wdate}" pattern="yyyy-MM-dd"/></td>
			<td>${v.cnt}</td>
		</tr>
	</c:forEach>
</table>
<br><br>
<a href="insertBoard.jsp"><spring:message code="message.board.getBoardList.insertBoard" /></a>


</body>
</html>