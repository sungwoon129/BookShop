<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<form method="post" action="/login">
			<div>
				<label>아이디 : </label>
				<input type="text" name="id">
			</div>
			
			<div>
				<label>비밀번호 : </label>
				<input type="text" name="password">
			</div>
			
			<div>
				<input type="submit" value="로그인">
			</div>
		</form>
	</div>
</body>
</html>