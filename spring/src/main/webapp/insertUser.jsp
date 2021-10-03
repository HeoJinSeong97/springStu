<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<h2>회원정보 입력</h2>
<hr>
<form action="insertUser.do" method="post">
	<table border="1">
		<tr>
			<td bgcolor="lightblue">이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">비밀번호</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td bgcolor="lightblue">권한</td>
			<td><select name="role"><option selected>USER</option><option>ADMIN</option></select></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원가입" /></td>
		</tr>
	</table>
</form>
<br><br>
<a href="login.jsp">로그인하러가기</a>

</body>
</html>