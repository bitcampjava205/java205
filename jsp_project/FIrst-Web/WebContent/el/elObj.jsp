<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "손흥민");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	표현식 : <span><%= request.getAttribute("name") %></ span> <br>
	
	
	표현언어 : <span>${requestScope.name}</span>
	









</body>
</html>