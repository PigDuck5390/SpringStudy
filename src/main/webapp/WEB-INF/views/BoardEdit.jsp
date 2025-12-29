<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="/css/board-edit.css">

</head>
<body>

	<div class="edit-container">

		<form action="/board/update" method="POST">
			<input type="hidden" name="bid" value="${board.bid}" /> <input
				name="title" type="text" placeholder="수정할 제목" /></br> <input name="text"
				type="text" placeholder="수정할 내용" /></br>
			<button onclick="Click()">수정</button>
		</form>

	</div>

</body>
</html>

<script>
	function Click() {
		alert("왜 수정해");
	}
</script>
