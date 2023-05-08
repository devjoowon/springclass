<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${requestScope.formResult }"><h1>성공</h1></c:when>
		<c:when test="${requestScope.formResult }"><h1>실패</h1></c:when>
	</c:choose>
	<br><br>
	<ul>
		<li>이름 : ${requestScope.nameResult }</li>
		<li>주소 : ${requestScope.addressResult }</li>
 		<li>좋아하는 과일 : ${requestScope.fruitsResult }</li>
	</ul>
</body>
</html>