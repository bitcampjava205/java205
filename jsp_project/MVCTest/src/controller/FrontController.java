package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 사용자의 요청 분석 : URI를 추출해서 사용
		String commandUri = request.getRequestURI();
		// http://localhost:8080/mvc/guest/list.do -> /mvc/guest/list.do
		if (commandUri.indexOf(request.getContextPath()) == 0) {
			commandUri = commandUri.substring(request.getContextPath().length());
		}

		// 결과 Data
		Object resultObj = null;
		// view 페이지
		String viewPage = "/WEB-INF/views/default.jsp";

		// 2. 요청을 처리 : 모델 선택 실행 -> 요청을 처리할 수 있는 Service를 선택
		if (commandUri.equals("/greeting.do")) { // http://localhost:8080/mvc/greeting.do
			// 처리할수 있는 서비스의 메소드 실행
			resultObj = "안녕하세요";
			viewPage = "/WEB-INF/views/greeting.jsp";
		} else if (commandUri.equals("/date.do")) {
			resultObj = new Date();
			viewPage = "/WEB-INF/views/date.jsp";
		} else {
			resultObj = "Invalid Type Request";
		}

		// 3. 결과 데이터를 공유(전달)
		request.setAttribute("result", resultObj);

		// 4. viewPage로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
