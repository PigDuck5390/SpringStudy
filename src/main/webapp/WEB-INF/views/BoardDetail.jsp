<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>

<link rel="stylesheet"
	href="/css/board-detail.css">

</head>
<body>

	<div class="container">

		<h1 class="post-title">제목: 
		<c:out value="${boardDetail.title}" /></h1>
		<div class="post-writer">작성자: 
		<c:out value="${boardDetail.id}"/></div>

		<div class="post-content"><c:out value="${boardDetail.text}"/></div>

		<hr>

		<div class="comment-section">
			<h3>댓글</h3>

			<c:forEach var="c" items="${comments}">
				<div class="comment">
					<b><c:out value="${c.uid}"/></b> : 
					<c:out value="${c.cmtext}" />

					<form action="/comment/delete" method="post">
						<input type="hidden" name="cid" value="${c.cid}" /> <input
							type="hidden" name="bid" 
							value="${boardDetail.bid}" />
						<button type="submit">삭제</button>
					</form>
				</div>
			</c:forEach>

			<form class="comment-form" action="/comment/add" method="post">
				<input type="hidden" name="bid" value="${boardDetail.bid}" />

				<textarea name="cmtext" placeholder="댓글 입력해봐"></textarea>
				<br> <input type="text" name="uid" 
				placeholder="내가 썼다" required /><br>

				<button type="submit">댓글 등록</button>
			</form>
		</div>

		<hr>

		<div class="action-buttons">
			<a href="/board/edit?bid=${boardDetail.bid}">
				<button class="edit-btn">수정하게?</button>
			</a>

			<form action="/board/delete" method="post" style="display: inline;">
				<input type="hidden" name="bid" value="${boardDetail.bid}" />
				<button class="delete-btn" onclick="return confirm('왜 삭제하는데');">
					삭제하게?</button>
			</form>

			<a class="list-link" href="/boardlist">돌아가고싶나?</a>
		</div>

	</div>

</body>
</html>
