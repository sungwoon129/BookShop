<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		고객번호: ${view.custid}
	</div>
	<div>
		고객명: ${view.name}
	</div>
	<div>
		주소: ${view.address}
	</div>
	<div>
		폰번호: ${view.phone}
	</div>
	<a href="list">목록으로</a>
</body>
</html>