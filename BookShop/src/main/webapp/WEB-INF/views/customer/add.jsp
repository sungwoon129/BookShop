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
				<label>고객번호:</label>
				<input type="number" name="custid">
			</div>
			<div>
				<label>고객명:</label>
				<input type="text" name="name">
			</div>
			<div>
				<label>주소:</label>
				<input type="text" name="address">
			</div>
			<div>
				<label>폰번호:</label>
				<input type="number" name="phone">
			</div>
			<div>
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>