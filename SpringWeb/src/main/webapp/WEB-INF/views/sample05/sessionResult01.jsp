<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>데이터가 잘 나오나요?</h1>
	<h2>RequestScope</h2>
	
	<h3>requestScope.data1(O): ${requestScope.data1 }</h3>
	<h3>requestScope.data2(O): ${requestScope.data2 }</h3>
	<h3>param.msg(O) : ${param.msg }</h3>
	<h3>param.msg(O) : ${param.msg }</h3>
	<h3>requestScope.newUser(O): ${requestScope.newUser }</h3>
	<h3>requestScope.user(X): ${requestScope.user }</h3>
	<h3>requestScope.userVO(X): ${requestScope.userVO }</h3>
	
	<h2>SessionScope</h2>
	
	<h3>sessionScope.data1(O): ${sessionScope.data1 }</h3>
	<h3>sessionScope.data2(X): ${sessionScope.data2 }</h3>
	<h3>sessionScope.newUser(X): ${sessionScope.newUser }</h3>
	<h3>sessionScope.user(X): ${sessionScope.user }</h3>
	<h3>sessionScope.userVO(X): ${sessionScope.userVO }</h3>
	
	<a href="${header.referer }">뒤로가기</a>
	<br><br>
</body>
</html>