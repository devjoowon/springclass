<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- EL에서 참조할 수 있는 Scope는 총4개가 있어요!
		=> pageScope, requestScope, sessionScope, applicationScope
	 -->
	 <%
	 	pageContext.setAttribute("myData", "소리없는 아우성!");
	 %>
	 <h1>결과 출력</h1>
	 request.getAttribute("msg") : <%=request.getAttribute("msg") %>
	 <br><br>
	 $ {msg } 의 결과 : ${msg }
	 <br><br>
	 param.msg 의 결과 : ${param.msg }  (아무것도 안나오는게 정상이에요!)
	 <br><br>
	 pageScope.msg의 결과 : ${pageScope.msg }  (아무것도 안나오는게 정상이에요!)
	 <br><br>
	 pageScope.myData의 결과 : ${pageScope.myData }
	 <br><br>
	 requestScope.msg의 결과 : ${requestScope.msg }
</body>
</html>