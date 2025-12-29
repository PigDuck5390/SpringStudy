<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/css/login.css">
</head>
<body>
	<div class="container">
		<h1>로그인</h1>
		<form action="/login" method="POST">
			<div class="login-container">
				<input id="username" name="username" type="text" name="id"
					placeholder="아이디" required oninput="this.value = this.value.trim()">

				<input id="password" name="password" type="password" name="pw"
					placeholder="비밀번호" required
					oninput="this.value = this.value.trim()">
			</div>

			<div class="login-btn-wrap">
				<button class="login-btn">로그인</button>
			</div>
		</form>
			<div class="login-btn-wrap">
				<a href="/regist">회원가입...하실래요?</a>
			</div>
	
	</div>
</body>
</html>