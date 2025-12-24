<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/board-list.css">

</head>
<body>
	<div class="container">
		<h1>글</h1>
		<div class="write-btn-wrap">
			<a href="/board/write" class="write-btn">글 작성</a>		
		</div>
		<hr>
		<h2>글 목록</h2>
		<ul class="board-list">
			<c:forEach items="${boardlist}" var="board">
				<li><a href="/board/detail?bid=${board.bid}">
				<c:out value="${board.bid}" /> .
				<c:out value="${board.title}" />
				</a></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
