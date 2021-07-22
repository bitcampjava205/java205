<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자가 전달한 데이터를 받고 -> DB에서 확인 -> 로그인 처리
	// reid 확인 하고 값을 받아오면 쿠키 설정
	
	String memberId = request.getParameter("memberid");
	String password = request.getParameter("password");
	String reid = request.getParameter("reid");
	
	// ID 저장을 위한 쿠키 설정
	// reid 값의 유무 체크
	if(reid!=null && reid.equals("on")){
		// 쿠키 저장 : 사용자 ID를 저장
		response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 60*60*24*365));
	} else {
		// 쿠키값을 저장하지 않는다!!!
		response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 0));
	}
%>

<script>
	alert('로그인 되었습니다.');
	location.href = '<%= request.getContextPath()%>';   // /mm
</script>






