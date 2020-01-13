<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="/resources/common.css">
</head>
<body>
	<div>
		<div>
			<form method="get">
				<select name="searchMode">
					<option value="1">고객번호</option>
					<option value="2">고객명</option>
					<option value="3">주소</option>
				</select>
				<input name="keyword" type="text" value="${pager.keyword}">
				<input type="submit" value="검색">
			</form>
		</div>
		<table border="1">
			<thead>
				<tr>
					<th>고객번호</th>
					<th>고객명</th>
					<th>주소</th>
					<th>폰번호</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${list.size() > 0}">
						<c:forEach var="item" items="${list}">
							<tr>
								<td>${item.custid}</td>
								<td>${item.name}</td>
								<td>${item.address}</td>
								<td>${item.phone}</td>
								<td><a href="update?custid=${item.custid}">변경</a>
								<a href="delete?custid=${item.custid}">삭제</a></td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="5">등록된 고객이 없습니다</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
		<div class="pagination">${pager.pagination}</div>
	</div>
	<div style="clear:left;"><a href="add">등록</a></div>
	<div><a href="../">이전으로</a></div>
	<div><a href="dummy">더미등록</a></div>
	<div><a href="init">더미삭제</a></div>
</body>
</html>