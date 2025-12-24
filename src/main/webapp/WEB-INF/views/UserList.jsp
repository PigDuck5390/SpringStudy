<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>UserList 보러왔니?</h1>
	<c:out value="Hello" />
	<c:forEach items="${userlist}" var="user">
		<a href="/userdetail?id=${user.id}">
		<c:out value="${user.name}" />
		</a>
	</c:forEach>
</body>
</html>