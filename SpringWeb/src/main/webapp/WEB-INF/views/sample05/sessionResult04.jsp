<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션에 들어있는지 확인</h1>
	<h3>sessionScope.data1 : ${sessionScope.data1 }</h3>	<!-- 컨트롤러에 data1이라는거 없어서 안나올 것임 -->
	<h3>sessionScope.newUser : ${sessionScope.newUser }</h3>
</body>
</html>