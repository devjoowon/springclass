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
	<h1>회원정보입니다!</h1>
	<br>
	<c:choose>
		<c:when test="${!empty requestScope.memberVO}"> <!-- requestScope안에 memberVO가 있니(!) -->
			<ul><!-- 2번호출 -->
				<li>request객체에 붙어있는 id : ${memberVO.id }</li>
				<li>request객체에 붙어있는 name : ${memberVO.name }</li>
				<li>Model객체에 붙어있는 id : ${member.id }</li>
				<li>Model객체에 붙어있는 name : ${member.name }</li>
			</ul>
		</c:when>
		
		<c:when test="${!empty requestScope.myVO}"> <!-- requestScope안에 memberVO가 있니(!) -->
			<ul><!-- 3번호출 -->
				<li>Model객체에 붙어있는 id : ${myVO.id }</li>
				<li>Model객체에 붙어있는 name : ${myVO.name }</li>
			</ul>
		</c:when>
		
		<c:otherwise>
			<ul><!-- 이도저도 아님=1번호출 -->
				<li>Model객체에 붙어있는 id : ${id }</li>
				<li>Model객체에 붙어있는 name : ${name }</li>
			</ul>
		</c:otherwise>
	</c:choose>
</body>
</html>