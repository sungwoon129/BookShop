<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>booklist</title>
<link rel="stylesheet" type="text/css" href="/resources/common.css" >
<script type="text/javascript">
	console.log("${pager.keyword}");
</script>
</head>
<body>
	<div>
		<div>
			<form method="get">
				<select name="searchMode">
					<option value="1">도서번호</option>
					<option value="2">도서명</option>
					<option value="3">출판사</option>
				</select>
				<input name="keyword" type="text" value="${pager.keyword}">
				<input type="submit" value="검색">
			</form>
		</div>
		<table border="1">
			<thead>
				<tr>
					<th>도서번호</th>
					<th>도서명</th>
					<th>출판사</th>
					<th>가격</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${list.size() > 0}">
						<c:forEach var="item" items="${list}">
							<tr>
								<td>${item.bookid}</td>
								<td><a href="view?bookid=${item.bookid}">${item.bookname}</a></td>
								<td>${item.publisher}</td>
								<td>${item.price}</td>
								<td><a href="update?bookid=${item.bookid}">변경</a>
								<a href="delete?bookid=${item.bookid}">삭제</a></td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="5">등록된 도서가 없습니다</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
		<div class="pagination">${pager.pagination}</div>
	</div>
	<div style="clear:left"><a href="add">등록</a></div>
	<div><a href="../">이전으로</a></div>
	<div><a href="dummy">대량등록</a></div>
	<div><a href="init">초기화</a></div>
</body>
</html>