<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="loginbox">
		<form action="updateMember.do" method="post">
			<p>ID<input type="text" name="id" value="${vvv.id }" readonly="readonly"></p>
			<p>PW<input type="password" name="password" value="${vvv.password }"></p>
			<p>ROLE<input type="text" name="role" value="${vvv.role }"></p>
			<p ><input type="submit" value="UPDATE"></p>
			<p ><input type="button" value="DELETE" onclick="location.href='deleteMember.do?id=${vvv.id}'"></p>
		</form>
	</div>
</body>
</html>