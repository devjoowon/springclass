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
		<c:when test="${ requestScope.lottoResult == true}">당첨!</c:when>
		<c:when test="${ requestScope.lottoResult == false}">낙첨...</c:when>
	</c:choose>
	
	<a href="${header.referer }">뒤로가기!</a>
</body>
</html>