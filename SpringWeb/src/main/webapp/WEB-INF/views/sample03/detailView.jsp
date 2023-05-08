<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이미지 결과</h1>
	<h3>이미지 이름 : ${imgname }</h3>
	<hr>
	<img src="/springweb/resources/images/${imgname }.jpg">
</body>
</html>