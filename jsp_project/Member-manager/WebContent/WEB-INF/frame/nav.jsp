<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Object loginObj = session.getAttribute("member");
	
%>
    
	<nav>
		<ul>
			<% if(loginObj == null) { %>
			<li><a href="<%= request.getContextPath() %>/regForm.jsp">회원가입</a></li>
			<li><a href="<%= request.getContextPath() %>/loginForm.jsp">로그인</a></li>
			<%}  else {%>
			<li>로그아웃</li>
			<li><a href="<%= request.getContextPath()%>/member_list.jsp">회원리스트</a></li>
			<%} %>
		</ul>
	</nav>