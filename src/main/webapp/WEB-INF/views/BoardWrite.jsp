<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/board-write.css">

</head>
<body>

	<div class="container">

		<h1>써봐</h1>
		<hr>

		<form action="/write" method="post">

			<div class="form-group">
				<input name="title" type="text" placeholder="제목" required />
			</div>

			<div class="form-group">
				<textarea name="text" placeholder="내용" required></textarea>
			</div>

			<div class="form-group">
				<input name="id" type="text" placeholder="작성자" required />
			</div>

			<div class="button-area">
				<button type="submit" class="submit-btn"
					onclick="return confirm('등록하게?ㅋ');">등록</button>
			</div>

		</form>

		<a class="list-link" href="/boardlist">게시판 목록</a>

	</div>

</body>
</html>
