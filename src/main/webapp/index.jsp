<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>whiskeyRecord</title>
</head>
<body>
	<h1>whiskeyRecord</h1>
	<form action="/whiskeyRecord/Login" method="post">
		<p>ユーザー名：<input type="text" name="userName"></p>
		<p>パスワード：<input type="password" name="password"></p>
		<p><input type="submit" value="ログイン"></p>
	</form>
</body>
</html>