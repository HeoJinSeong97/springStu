<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginPage</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
		<style type="text/css">
		.loginbox{margin: 50px 30px 0px;}
		.loginbox > input[type="submit"] {width: 500px;}
		.loginbox > p {color: white;}
		</style>
</head>
<body>
	<div class="loginbox">
		<form action="login.do" method="post">
			<p style="color: white;">ID<input type="text" name="id"></p>
			<p style="color: white;">PW<input type="password" name="password"></p>
			<p ><input type="submit" value="Login" style="color: white; outline-color: white;"></p>
		</form>
	</div>
</body>
</html>