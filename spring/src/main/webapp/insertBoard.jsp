<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성중...</title>
</head>
<body>

<h2>게시글 작성화면</h2>
<hr>
<form action="insertBoard.do" method="post" enctype="multipart/form-data">
	<table border="1">
		<tr>
			<td bgcolor="lightblue">글 제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">작성자</td>
			<td><input type="text" name="writer"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">상세 내용</td>
			<td><input type="text" name="content"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">파일 업로드</td>
			<td><input type="file" name="uploadFile"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="글 등록하기" /></td>
		</tr>
	</table>
</form>
<br><br>
<a href="getBoardList.do">게시글 목록보기</a>

</body>
</html>