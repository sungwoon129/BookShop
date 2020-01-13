<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<form action="add" method="post">
			<div>
				<label>도서번호:</label>
				<input type="number" name="bookid">
			</div>
			<div>
				<label>도서명:</label>
				<input type="text" name="bookname">
			</div>
			<div>
				<label>출판사:</label>
				<input type="text" name="publisher">
			</div>
			<div>
				<label>가격:</label>
				<input type="number" name="price">
			</div>
			<div>
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>