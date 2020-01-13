<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- CDN방식 (컨텐츠 딜리버리 네트워크) : 가까운곳에서 다운받는다 -->
<script>
	$(function() {
		$("button").click(function() {
			var data = $("#review").val();
			
			$.ajax("/review/add", { 
				method:"POST",
				data: {
					review:data,
					bookid: ${view.bookid}
				},
				success: function(result) {
					console.log(result);
					
					if(result == 1)
						$("#reviews").append("<li>" + data + "</li>");
				}
			});
		});
	});
</script>
</head>
<body>
	<div>
		<div>
			책번호 : ${view.bookid}
		</div>
		<div>
			책이름 : ${view.bookname}
		</div>
		<div>
			출판사 : ${view.publisher}
		</div>
		<div>
			가격 : ${view.price}
		</div>
	</div>
	<div>
		<div>구매후기</div>
		<div><input id="review"><button>등록</button></div>
		<div><ul id="reviews">
			<c:choose>
				<c:when test="${reviews.size() > 0}">
					<c:forEach var="review" items="${reviews}">
						<li>${review.review} &emsp; ${review.reviewdate}</li>
					</c:forEach>
				</c:when>
				<c:otherwise><li>구매후기가 없습니다</li></c:otherwise>
			</c:choose>
		</ul></div>
	</div>
	<div><a href="list">목록으로</a></div>
</body>
</html>