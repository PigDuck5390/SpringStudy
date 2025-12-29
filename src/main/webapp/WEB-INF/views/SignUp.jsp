<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/css/regist.css">
</head>
<body>
	<div class="container">
		<h1>회원가입</h1>
		<form action="/regist" method="POST">

			<div class="regist-container">
				<input id="username" class="regist-id" type="text" name="id"
					placeholder="아이디" required oninput="this.value = this.value.trim()">

				<input id="password" class="regist-pw" type="password" name="pw"
					placeholder="비밀번호" required
					oninput="this.value = this.value.trim()">
			</div>

			<div class="regist-btn-wrap">
				<button class="regist-btn">회원가입</button>
			</div>

		</form>
			<div class="regist-btn-wrap">
				<a href="/login">로그인하러 갈 사람~ 하잇!</a>
			</div>
	</div>

</body>
</html>

