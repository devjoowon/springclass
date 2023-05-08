<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요청을 처리하는데 문제가 있어요!</h1>
	
	<h3>오류의 원인 : ${msg }</h3>
	<a href="${header.referer }">뒤로가기!</a>
</body>
</html>