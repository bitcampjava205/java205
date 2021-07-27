<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 데이터 받고 -> Service에 요청 -> Dao 
	String mid = request.getParameter("mid");
	String pw = request.getParameter("password");
	
%>
<jsp:forward page="delete_view.jsp" />