<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과는 다음과 같습니다.</h1>
	
	<h3>Model로 전달된 데이터를 출력해 보아요!</h3>
	<ul>
		<li>${myName }</li>	<!-- TestController08에 있는 key값 -->
		<li>${myAge }</li>
	</ul>
	
	<h3>EL이 가지는 내장객체를 이용해서 이렇게 처리도 가능하죠.</h3>
	<!-- 클라이언트가 보내는 파라미터를 직접 땡길 수 있음 -->
	<ul>
		<li>${param.name }</li>	<!-- test08.html에 있는 name -->
		<li>${param.age }</li>
	</ul>
	
	<!-- header정보가 이전 페이지 포함하고 있음 -->
	<a href="${header.referer }">이전 화면으로 가기!</a>
</body>
</html>