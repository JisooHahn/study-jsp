<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex04-result</title>
</head>
<body>
	<h1><%=request.getAttribute("result") %></h1>
	<form action="ex04.jsp" method="get">
		<button>처음으로 돌아가기</button>
	</form>
</body>
</html>