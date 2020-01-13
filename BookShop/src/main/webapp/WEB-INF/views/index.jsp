<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
	<!-- 구조적으로 알아보기 쉽게 c:choose사용한 것 c:if로 두번 써도 ok -->
		<c:choose>
			<c:when test="${sessionScope.user eq null}">
				<a href="/login">로그인</a>
			</c:when>
			<c:otherwise>
				<a href="/logout">로그아웃</a>
			</c:otherwise>
		</c:choose>
	</div>
	<h1>마당서점</h1>
	<ul>
		<li><a href="book/list">도서관리</a></li>
		<li><a href="customer/list">고객관리</a></li>
	</ul>
</body>
</html>